package pl.example.domain;

import lombok.*;
import pl.example.infrastructure.database.entity.DepartmentEntity;
import pl.example.infrastructure.database.entity.ProjectEntity;

import java.util.Set;

@Builder
@Data
@Getter
@Setter
@With
public class Team {
    Long id;
    String name;
    Department department;
    Set<Project> projects;
}
