package pl.example.api.dto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import pl.example.api.dto.ManagerDTO;
import pl.example.api.dto.ProjectDTO;
import pl.example.domain.Manager;
import pl.example.domain.Project;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProjectMapper {

    ProjectDTO map(Project project);
    Project map(ProjectDTO projectDTO);
}
