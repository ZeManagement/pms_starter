package de.szut.pms.projectemployee;

public record CreateProjectEmployeeDto(

        Long projectId,

        Long employeeId,

        Long qualificationId
) {
}
