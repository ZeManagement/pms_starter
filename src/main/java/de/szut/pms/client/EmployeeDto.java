package de.szut.pms.client;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.List;

// Represents an employee retrieved from the Employee Service.
@Schema(description = "Represents an employee retrieved from the Employee Service.")
public record EmployeeDto(
        @Schema(description = "Unique identifier of the employee", example = "42", requiredMode = Schema.RequiredMode.REQUIRED)
        Long id,

        @Schema(description = "Last name of the employee", example = "Mustermann", requiredMode = Schema.RequiredMode.REQUIRED)
        String lastName,

        @Schema(description = "First name of the employee", example = "Max", requiredMode = Schema.RequiredMode.REQUIRED)
        String firstName,

        @Schema(description = "Street and house number of the employee's address", example = "Hauptstraße 12a", requiredMode = Schema.RequiredMode.REQUIRED)
        String street,

        @Schema(description = "Postcode of the employee's address", example = "28199", requiredMode = Schema.RequiredMode.REQUIRED)
        String postcode,

        @Schema(description = "City of the employee's address", example = "Bremen", requiredMode = Schema.RequiredMode.REQUIRED)
        String city,

        @Schema(description = "Phone number of the employee", example = "+49 421 123456", requiredMode = Schema.RequiredMode.REQUIRED)
        String phone,

        @Schema(description = "List of skills or qualifications assigned to the employee", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
        List<SkillDto> skillSet
) {
}
