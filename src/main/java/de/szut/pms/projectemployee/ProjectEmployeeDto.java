package de.szut.pms.projectemployee;

import io.swagger.v3.oas.annotations.media.Schema;

// Represents the assignment of an employee to a project
@Schema(description = "Represents the assignment of an employee to a project")
public record ProjectEmployeeDto(
        @Schema(description = "unique identifier of the project employee assignment", example = "1", requiredMode = Schema.RequiredMode.REQUIRED)
        Long id,

        @Schema(description = "unique identifier of the project", example = "12", requiredMode = Schema.RequiredMode.REQUIRED)
        Long projectId,

        @Schema(description = "unique identifier of the employee", example = "42", requiredMode = Schema.RequiredMode.REQUIRED)
        Long employeeId,

        @Schema(description = "unique identifier of the qualification the employee uses within the project", example = "5", requiredMode = Schema.RequiredMode.REQUIRED)
        Long qualificationId
) {
}
