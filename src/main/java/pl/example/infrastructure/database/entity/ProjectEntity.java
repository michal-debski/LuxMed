package pl.example.database.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "project")
public class ProjectEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_id")
    private Long id;


    private String name;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private TeamEntity team;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_manager_id")
    private ManagerEntity manager;
}