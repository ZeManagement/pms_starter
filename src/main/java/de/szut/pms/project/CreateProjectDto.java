package de.szut.pms.project;


import de.szut.pms.projectemployee.ProjectEmployee;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;
import java.util.List;

public record CreateProjectDto(
        @NotBlank(message = "Der Projektname darf nicht leer sein!")
        String projectName,

        @NotBlank(message = "Es muss ein Startdatum geben.")
        LocalDateTime startDate,

        @NotBlank(message = "Es muss ein Enddatum geben.")
        LocalDateTime endDate,

        @NotBlank(message = "Es muss eine Kunden ID angegeben werden.")
        Long customerId,

        String description,

        List<ProjectEmployee> projectEmployees

) {
}


