package de.szut.pms.project;

import de.szut.pms.projectemployee.ProjectEmployeeRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProjectService {
    private final ProjectRepository projectRepository;
    private final ProjectEmployeeRepository projectemployeerepository;
    private final ProjectMapper mapper;
    //private final HIER EXTERNER API SERVICE

    public ProjectService(ProjectRepository projectRepository, ProjectEmployeeRepository projectemployeerepository, ProjectMapper mapper){
        this.projectRepository = projectRepository;
        this.projectemployeerepository = projectemployeerepository;
        this.mapper = mapper;
    }

    @Transactional
    public ProjectDto create(CreateProjectDto dto, ){
        Project saved = projectRepository.save(mapper.toEntity(dto,));
        return mapper.toDto(saved);
    }
}
