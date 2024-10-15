package pl.example.domain;

import lombok.*;
import pl.example.infrastructure.database.entity.CompanyEntity;
import pl.example.infrastructure.database.entity.TeamEntity;

import java.util.Set;
@Builder
@Data
@Getter
@Setter
@With
public class Department {

     Long id;
     String name;

     Company company;
     Set<Team> teams;
}
