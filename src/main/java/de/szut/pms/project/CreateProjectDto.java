package de.szut.pms.project;

import de.szut.pms.projectemployee.CreateProjectEmployeeDto;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;

// Request payload for creating a new project.
@Schema(description = "Request payload for creating a new project.")
public record CreateProjectDto(
        @Schema(description = "name of the project", example = "E-Commerce Migration", requiredMode = Schema.RequiredMode.REQUIRED)
        @NotBlank(message = "Der Projektname darf nicht leer sein!")
        String projectName,

        @Schema(description = "planned start date of the project", example = "2026-03-01T08:00:00", requiredMode = Schema.RequiredMode.REQUIRED)
        @NotNull(message = "Es muss ein Startdatum geben.")
        LocalDateTime startDate,

        @Schema(description = "planned end date of the project", example = "2026-09-30T17:00:00", requiredMode = Schema.RequiredMode.REQUIRED)
        @NotNull(message = "Es muss ein Enddatum geben.")
        LocalDateTime endDate,

        @Schema(description = "identifier of the project lead", example = "42", requiredMode = Schema.RequiredMode.REQUIRED)
        @NotNull(message = "Es muss eine Projektleitung geben.")
        Long projectLeadId,

        @Schema(description = "identifier of the customer", example = "109", requiredMode = Schema.RequiredMode.REQUIRED)
        @NotNull(message = "Es muss eine Kunden ID angegeben werden.")
        Long customerId,

        @Schema(description = "optional description of the project", example = "Migration legacy monolith to cloud infrastructure", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
        String description,

        @Schema(description = "optional list of employees assigned during project creation, including their qualifications", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
        List<CreateProjectEmployeeDto> employees
) {
}
