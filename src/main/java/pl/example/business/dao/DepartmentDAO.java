package pl.example.business.dao;

import pl.example.domain.Company;
import pl.example.domain.Department;
import pl.example.domain.Project;
import pl.example.domain.Team;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface DepartmentDAO {
    Optional<Department> findDepartmentById(Long id);
    Department saveDepartment(Department department);

    void deleteDepartmentById(Long id);

    List<Department> findAllDepartments();
    void updateDepartment(Department departmentToUpdate, String name, Company company, Set<Team> teams);

}
