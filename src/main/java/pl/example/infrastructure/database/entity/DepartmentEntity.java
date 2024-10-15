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
@Table(name = "department")
public class DepartmentEntity {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "department_id")
    private Long id;


    private String name;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private CompanyEntity company;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "department")
    private Set<TeamEntity> teams;

}
