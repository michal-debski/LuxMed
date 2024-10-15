package pl.example.domain;

import lombok.*;
import pl.example.infrastructure.database.entity.DepartmentEntity;

import java.util.Set;


@Builder
@Data
@Getter
@Setter
@With
public class Company {
    Long id;

    String name;
    Set<Department> departments;

}
