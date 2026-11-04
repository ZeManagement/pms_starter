package de.szut.pms.client.dto;

import de.szut.pms.client.SkillDto;

public record EmployeeWithQualificationDto(
        EmployeeNameDto employee,
        SkillDto qualification
) {
}
