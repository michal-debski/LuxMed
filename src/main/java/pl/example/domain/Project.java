package pl.example.domain;

import lombok.*;
import pl.example.infrastructure.database.entity.ManagerEntity;
import pl.example.infrastructure.database.entity.TeamEntity;

@Builder
@Data
@Getter
@Setter
@With
public class Project {
     Long id;
     String name;
     Team team;
     Manager manager;
}
