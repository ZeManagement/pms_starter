package de.szut.pms.project;

import de.szut.pms.projectemployee.ProjectEmployee;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProjectMapper {

    public ProjectDto toDto(Project project) {
        return new ProjectDto(
                project.getId(),
                project.getProjectName(),
                project.getStartDate(),
                project.getEndDate(),
                project.getProjectLeadId(),
                project.getCustomerId(),
                project.getDescription(),
                project.getProjectemployees()
                        .stream()
                        .map(employee -> employee.getEmployeeId())
                        .toList()
        );
    }

    public Project toEntity(CreateProjectDto dto) {
        Project project = new Project();

        project.setProjectName(dto.projectName());
        project.setStartDate(dto.startDate());
        project.setEndDate(dto.endDate());
        project.setProjectLeadId(dto.projectLeadId());
        project.setCustomerId(dto.customerId());
        project.setDescription(dto.description());
        return project;
    }
}
