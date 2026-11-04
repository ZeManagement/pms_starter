package de.szut.pms.client;

import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDateTime;

// Represents the detailed information of a project assignment for a specific employee.
@Schema(description = "Represents the detailed information of a project assignment for a specific employee.")
public record EmployeeProjectsDetailsDto(
        @Schema(description = "unique identifier of the project", example = "12", requiredMode = Schema.RequiredMode.REQUIRED)
        Long projectId,

        @Schema(description = "name of the project", example = "Migration", requiredMode = Schema.RequiredMode.REQUIRED)
        String projectName,

        @Schema(description = "planned start date of the project", example = "2026-03-01T08:00:00", requiredMode = Schema.RequiredMode.REQUIRED)
        LocalDateTime startDate,

        @Schema(description = "planned end date of the project", example = "2026-09-30T17:00:00", requiredMode = Schema.RequiredMode.REQUIRED)
        LocalDateTime endDate,

        @Schema(description = "unique identifier of the qualification used in this project", example = "5", requiredMode = Schema.RequiredMode.REQUIRED)
        Long qualificationId,

        @Schema(description = "name of the qualification used in this project", example = "Java Backend Development", requiredMode = Schema.RequiredMode.REQUIRED)
        String qualificationName
) {
}
