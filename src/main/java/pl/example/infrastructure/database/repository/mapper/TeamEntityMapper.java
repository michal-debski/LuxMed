package pl.example.database.repository.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import pl.example.database.entity.TeamEntity;
import pl.example.domain.Team;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)

public interface TeamEntityMapper {

    TeamEntity mapToEntity(Team team);
    Team mapFromEntity(TeamEntity teamEntity);
}
