package pl.example.api.dto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import pl.example.api.dto.DepartmentDTO;
import pl.example.api.dto.ManagerDTO;
import pl.example.domain.Department;
import pl.example.domain.Manager;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)

public interface ManagerMapper {

    ManagerDTO map(Manager manager);
    Manager map(ManagerDTO managerDTO);
}
