package pl.example.database.repository.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import pl.example.database.entity.DepartmentEntity;
import pl.example.domain.Department;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)

public interface DepartmentEntityMapper {

    DepartmentEntity mapToEntity(Department department);

    Department mapFromEntity(DepartmentEntity departmentEntity);
}
