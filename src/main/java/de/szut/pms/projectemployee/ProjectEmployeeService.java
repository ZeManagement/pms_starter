package de.szut.pms.projectemployee;

import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

@Service
public class ProjectEmployeeService {

    private final ProjectEmployeeRepository projectEmployeeRepository;
    private final ProjectEmployeeMapper mapper;

    public ProjectEmployeeService(ProjectEmployeeRepository projectEmployeeRepository, ProjectEmployeeMapper mapper) {
        this.projectEmployeeRepository = projectEmployeeRepository;
        this.mapper = mapper;
    }

    public ProjectEmployeeDto create(@Valid CreateProjectEmployeeDto dto) {
        return null;
    }
}
