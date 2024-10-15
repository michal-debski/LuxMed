package pl.example.business.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.example.business.dao.CompanyDAO;
import pl.example.domain.Company;
import pl.example.domain.Department;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class CompanyService {

    private final CompanyDAO companyDAO;

     public Optional<Company> findCompanyById(Long id){
        return companyDAO.findCompanyById(id);
    }
    public Company saveCompany(Company company){
        return companyDAO.saveCompany(company);
    }

    public void deleteCompanyById(Long id){
        companyDAO.deleteCompanyById(id);
    }

    public List<Company> findAllCompanies(){
        return companyDAO.findAllCompanies();
    }

    public Company updateCompany(Company company, String name, Set<Department> departments){
        return companyDAO.updateCompany(company, name, departments);
    }


}
