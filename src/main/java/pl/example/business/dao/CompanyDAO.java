package pl.example.business.dao;


import pl.example.domain.Company;
import pl.example.domain.Department;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface CompanyDAO {

    Optional<Company> findCompanyById(Long id);
    Company saveCompany(Company company);

    void deleteCompanyById(Long id);

    List<Company> findAllCompanies();

    Company updateCompany(Company company, String name, Set<Department> departments);
}
