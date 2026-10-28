package de.szut.pms.projectemployee;

import de.szut.pms.project.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ProjectEmployeeRepository extends JpaRepository<ProjectEmployee, Long> {
    // alle Projekte eines Mitarbeiters abrufen
    List<Project> findAllByProjectIdOrderByIdDesc(Long employeeId);

    long countByProjectId(Long projectId);
}



