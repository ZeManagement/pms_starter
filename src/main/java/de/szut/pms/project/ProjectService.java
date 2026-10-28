package de.szut.pms.project;

import de.szut.pms.client.ExternalApiClient;
import de.szut.pms.projectemployee.ProjectEmployee;
import de.szut.pms.projectemployee.ProjectEmployeeRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class ProjectService {
    private final ExternalApiClient externalApiClient;
    private final ProjectRepository projectRepository;
    private final ProjectEmployeeRepository projectemployeerepository;
    private final ProjectMapper mapper;


    public ProjectService(ProjectRepository projectRepository, ProjectEmployeeRepository projectemployeerepository, ProjectMapper mapper, ExternalApiClient externalApiClient) {
        this.projectRepository = projectRepository;
        this.projectemployeerepository = projectemployeerepository;
        this.mapper = mapper;
        this.externalApiClient = externalApiClient;
    }

    @Transactional
    public ProjectDto create(CreateProjectDto dto){

        // prüft ob ID existiert
        externalApiClient.getEmployeeById(dto.projectLeadId());

        // prüft ob IDs (falls angegeben) gültig sind
        if (dto.employeeIds() != null) {
            for (Long id : dto.employeeIds()) {
                externalApiClient.getEmployeeById(id);
            }
        }

        Project saved = projectRepository.save(
                mapper.toEntity(dto)
        );

        // baut projectEmployee Objekt
        if(dto.employeeIds() != null){
            for(Long id : dto.employeeIds()) {
                ProjectEmployee p = new ProjectEmployee();
                p.setEmployeeId(id);
                p.setProject(saved);
                p.setQualificationID(p.getQualificationID());
                projectemployeerepository.save(p);
            }
        }

        return mapper.toDto(saved);
    }

    @Transactional(readOnly = true)
    public List<ProjectDto> findAll(){
        return projectRepository.findAll().stream()
                .map(project -> mapper.toDto(
                        project
                        ))
                        //projectemployeerepository.countByProjectId(project.getId())))
                .toList();
    }
}
