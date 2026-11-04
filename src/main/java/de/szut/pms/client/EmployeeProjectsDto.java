package de.szut.pms.client;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.List;

// Represents all projects an employee has participated in.
@Schema(description = "Represents all projects an employee has participated in.")
public record EmployeeProjectsDto(
        @Schema(description = "unique identifier of the employee", example = "42", requiredMode = Schema.RequiredMode.REQUIRED)
        Long employeeId,

        @Schema(description = "list of project details the employee is or was assigned to", requiredMode = Schema.RequiredMode.REQUIRED)
        List<EmployeeProjectsDetailsDto> projects
) {
}
