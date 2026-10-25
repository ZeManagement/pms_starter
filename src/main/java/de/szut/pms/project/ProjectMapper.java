package de.szut.pms.project;

import de.szut.pms.projectemployee.ProjectEmployee;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProjectMapper {

    public ProjectDto toDto(Project project){
        return new ProjectDto(
                project.getId(),
                project.getProjectName(),
                project.getStartDate(),
                project.getEndDate(),
                project.getCustomerId(),
                project.getDescription(),
                project.getProjectemployees());
    }

    public Project toEntity(CreateProjectDto dto, List<ProjectEmployee> projectemployees){
        Project project = new Project();
        project.setProjectemployees(dto.projectEmployees());
        project.setProjectName(dto.projectName());
        project.setStartDate(dto.startDate());
        project.setEndDate(dto.endDate());
        project.setCustomerId(dto.customerId());
        project.setDescription(dto.description());
        return project;
    }
}
