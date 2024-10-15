package pl.example.infrastructure.database.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import pl.example.business.dao.DepartmentDAO;
import pl.example.domain.Company;
import pl.example.domain.Department;
import pl.example.domain.Team;
import pl.example.infrastructure.database.repository.jpa.CompanyJpaRepository;
import pl.example.infrastructure.database.repository.jpa.DepartmentJpaRepository;
import pl.example.infrastructure.database.repository.mapper.CompanyEntityMapper;
import pl.example.infrastructure.database.repository.mapper.DepartmentEntityMapper;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Repository
@RequiredArgsConstructor
public class DepartmentRepository implements DepartmentDAO {
    private final DepartmentJpaRepository departmentJpaRepository;
    private final DepartmentEntityMapper departmentEntityMapper;
    @Override
    public Optional<Department> findDepartmentById(Long id) {
        return  departmentJpaRepository.findById(id)
                .map(departmentEntityMapper::mapFromEntity);
    }

    @Override
    public Department saveDepartment(Department department) {
        return departmentEntityMapper.mapFromEntity(departmentJpaRepository
                .save(departmentEntityMapper.mapToEntity(department)));
    }

    @Override
    public void deleteDepartmentById(Long id) {
        departmentJpaRepository.deleteById(id);
    }

    @Override
    public List<Department> findAllDepartments() {
        return departmentJpaRepository.findAll().stream()
                .map(departmentEntityMapper::mapFromEntity).toList();
    }

    @Override
    public void updateDepartment(Department departmentToUpdate, String name, Company company, Set<Team> teams) {
        departmentToUpdate.setName(name);
        departmentToUpdate.setCompany(company);
        departmentJpaRepository.save(departmentEntityMapper.mapToEntity(departmentToUpdate));

    }
}
