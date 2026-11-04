package de.szut.pms.client.dto;

import de.szut.pms.client.SkillDto;
import io.swagger.v3.oas.annotations.media.Schema;

// Represents an employee paired with the specific qualification they use in a project.
@Schema(description = "Represents an employee paired with the specific qualification they use in a project.")
public record EmployeeWithQualificationDto(
        @Schema(description = "The personal details of the employee", requiredMode = Schema.RequiredMode.REQUIRED)
        EmployeeNameDto employee,

        @Schema(description = "The specific qualification assigned to the employee for this context", requiredMode = Schema.RequiredMode.REQUIRED)
        SkillDto qualification
) {
}
