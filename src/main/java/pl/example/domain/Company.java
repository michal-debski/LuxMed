package pl.example.infrastructure.domain;

import jakarta.persistence.*;
import lombok.*;
import pl.example.infrastructure.infrastructure.entity.DepartmentEntity;

import java.util.Set;

@Builder
@Data
@Getter
@Setter
@With
public class Company {
    Long id;

    String name;
    Set<DepartmentEntity> departments;

}
