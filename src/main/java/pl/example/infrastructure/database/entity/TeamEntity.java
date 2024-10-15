package pl.example.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "team")
public class TeamEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "team_id")
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private DepartmentEntity department;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "team")
    private Set<ProjectEntity> projects;

}
