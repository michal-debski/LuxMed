package pl.example.infrastructure.database.repository.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import pl.example.infrastructure.database.entity.ManagerEntity;
import pl.example.domain.Manager;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)

public interface ManagerEntityMapper {

    ManagerEntity mapToEntity(Manager manager);
    Manager mapFromEntity(ManagerEntity managerEntity);
}
