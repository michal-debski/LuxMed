package pl.example.infrastructure.database.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import pl.example.business.dao.CompanyDAO;
import pl.example.domain.Company;
import pl.example.domain.Department;
import pl.example.infrastructure.database.entity.CompanyEntity;
import pl.example.infrastructure.database.repository.jpa.CompanyJpaRepository;
import pl.example.infrastructure.database.repository.mapper.CompanyEntityMapper;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Repository
@RequiredArgsConstructor
public class CompanyRepository implements CompanyDAO {


    private final CompanyJpaRepository companyJpaRepository;
    private final CompanyEntityMapper companyEntityMapper;

    @Override
    public Optional<Company> findCompanyById(Long id) {
        return companyJpaRepository.findById(id)
                .map(companyEntityMapper::mapFromEntity);
    }

    @Override
    public Company saveCompany(Company company) {
        return companyEntityMapper.mapFromEntity(companyJpaRepository
                .save(companyEntityMapper.mapToEntity(company)));
    }

    @Override
    public void deleteCompanyById(Long id) {
        companyJpaRepository.deleteById(id);
    }

    @Override
    public List<Company> findAllCompanies() {
        return companyJpaRepository.findAll().stream()
                .map(companyEntityMapper::mapFromEntity).toList();
    }

    @Override
    public Company updateCompany(Company company, String name, Set<Department> departments) {
        company.setName(name);
        company.setDepartments(departments);
        CompanyEntity savedCompanyEntity = companyJpaRepository.save(companyEntityMapper.mapToEntity(company));
        return companyEntityMapper.mapFromEntity(savedCompanyEntity);
    }
}
