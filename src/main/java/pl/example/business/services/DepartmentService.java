package pl.example.business.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.example.business.dao.DepartmentDAO;
import pl.example.domain.Company;
import pl.example.domain.Department;
import pl.example.domain.Team;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class DepartmentService {

    private final DepartmentDAO departmentDAO;
    Optional<Department> findDepartmentById(Long id){
        return  departmentDAO.findDepartmentById(id);
    }
    Department saveDepartment(Department department){
        return departmentDAO.saveDepartment(department);
    }

    void deleteDepartmentById(Long id){
        departmentDAO.deleteDepartmentById(id);
    }

    List<Department> findAllDepartments(){
        return departmentDAO.findAllDepartments();
    }
    void updateDepartment(Department departmentToUpdate, String name, Company company, Set<Team> teams){
        departmentDAO.updateDepartment(departmentToUpdate, name, company, teams);
    }


}
