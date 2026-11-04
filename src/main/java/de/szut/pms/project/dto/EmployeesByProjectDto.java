package de.szut.pms.project.dto;

import de.szut.pms.client.dto.EmployeeWithQualificationDto;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.List;

// Represents a project along with all assigned employees and their specific qualifications.
@Schema(description = "Represents a project along with all assigned employees and their specific qualifications.")
public record EmployeesByProjectDto(
        @Schema(description = "The basic details and name of the project", requiredMode = Schema.RequiredMode.REQUIRED)
        ProjectNameDto project,

        @Schema(description = "List of employees assigned to this project including their respective qualifications", requiredMode = Schema.RequiredMode.REQUIRED)
        List<EmployeeWithQualificationDto> employees
) {
}
