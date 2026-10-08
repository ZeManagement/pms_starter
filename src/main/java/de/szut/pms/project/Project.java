package de.szut.pms.project;

import de.szut.pms.projectemployee.ProjectEmployee;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="project")
@Getter
@Setter
@NoArgsConstructor
public class Project {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy="project",fetch=FetchType.LAZY)
    private List<ProjectEmployee> projectemployees = new ArrayList<>();

    @Column(name="project_name", nullable = false)
    private String projectName;

    @Column(name = "start_date", nullable = false)
    private LocalDateTime startDate;

    @Column(name = "end_date", nullable = false)
    private LocalDateTime endDate;

    private Long customerId;

    private String description;
}
