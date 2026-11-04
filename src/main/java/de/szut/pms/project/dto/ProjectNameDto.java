package de.szut.pms.project.dto;

import io.swagger.v3.oas.annotations.media.Schema;

// Represents the basic identification and name of a project.
@Schema(description = "Represents the basic identification and name of a project.")
public record ProjectNameDto(
        @Schema(description = "Unique identifier of the project", example = "1", requiredMode = Schema.RequiredMode.REQUIRED)
        Long id,

        @Schema(description = "The name of the project", example = "E-Commerce Migration", requiredMode = Schema.RequiredMode.REQUIRED)
        String projectName
) {
}
