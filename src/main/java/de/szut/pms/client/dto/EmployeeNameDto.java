package de.szut.pms.client.dto;

import io.swagger.v3.oas.annotations.media.Schema;

// Represents the basic name and identification details of an employee.
@Schema(description = "Represents the basic name and identification details of an employee.")
public record EmployeeNameDto(
        @Schema(description = "Unique identifier of the employee", example = "42", requiredMode = Schema.RequiredMode.REQUIRED)
        Long id,

        @Schema(description = "Last name of the employee", example = "Mustermann", requiredMode = Schema.RequiredMode.REQUIRED)
        String lastName,

        @Schema(description = "First name of the employee", example = "Max", requiredMode = Schema.RequiredMode.REQUIRED)
        String firstName
) {
}
