package pl.example.database.repository.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import pl.example.database.entity.ManagerEntity;
import pl.example.domain.Manager;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)

public interface ManagerEntityMapper {

    ManagerEntity mapToEntity(Manager manager);
    Manager mapFromEntity(ManagerEntity managerEntity);
}
