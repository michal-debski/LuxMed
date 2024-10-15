package pl.example.infrastructure.database.repository.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import pl.example.infrastructure.database.entity.ProjectEntity;
import pl.example.domain.Project;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)

public interface ProjectEntityMapper {

    ProjectEntity mapToEntity(Project project);
    Project mapFromEntity(ProjectEntity projectEntity);
}
