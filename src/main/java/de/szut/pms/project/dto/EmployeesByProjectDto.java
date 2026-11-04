package de.szut.pms.project.dto;

import de.szut.pms.client.dto.EmployeeWithQualificationDto;

import java.util.List;

public record EmployeesByProjectDto(
        ProjectNameDto project,
        List<EmployeeWithQualificationDto> employees
) {
}
