package pl.example.api.dto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import pl.example.api.dto.ProjectDTO;
import pl.example.api.dto.TeamDTO;
import pl.example.domain.Project;
import pl.example.domain.Team;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TeamMapper {

    TeamDTO map(Team team);
    Team map(TeamDTO teamDTO);
}
