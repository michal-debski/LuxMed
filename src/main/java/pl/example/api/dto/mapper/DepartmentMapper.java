package pl.example.api.dto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import pl.example.api.dto.CompanyDTO;
import pl.example.api.dto.DepartmentDTO;
import pl.example.domain.Company;
import pl.example.domain.Department;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DepartmentMapper {

    DepartmentDTO map(Department department);
    Department map(DepartmentDTO departmentDTO);
}
