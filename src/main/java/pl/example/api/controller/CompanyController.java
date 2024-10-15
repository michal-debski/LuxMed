package pl.example.api.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.example.api.dto.CompanyDTO;
import pl.example.api.dto.DepartmentDTO;
import pl.example.api.dto.mapper.CompanyMapper;
import pl.example.api.dto.mapper.DepartmentMapper;
import pl.example.business.services.CompanyService;
import pl.example.domain.Company;
import pl.example.domain.Department;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/companies")
@AllArgsConstructor
public class CompanyController {


    private CompanyService companyService;
    private CompanyMapper companyMapper;

    private DepartmentMapper departmentMapper;

    @GetMapping
    public List<CompanyDTO> getAllCompanies() {
        return companyService.findAllCompanies().stream()
                .map(companyMapper::map).toList();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CompanyDTO> getCompanyById(@PathVariable Long id) {
        Optional<CompanyDTO> company = companyService.findCompanyById(id).map(companyMapper::map);
        return company.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<CompanyDTO> createCompany(@RequestBody CompanyDTO companyDTO) {

        Company company = companyMapper.map(companyDTO);
        Company savedCompany = companyService.saveCompany(company);
        CompanyDTO dto = companyMapper.map(savedCompany);

        return ResponseEntity.ok(dto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CompanyDTO> updateCompany(
            @PathVariable Long id,
            @RequestBody CompanyDTO companyDTO,
            @RequestBody Set<DepartmentDTO> departmentsDTO) {

        Company company = companyMapper.map(companyDTO);
        Set<Department> departments = departmentsDTO.stream().map(departmentMapper::map).collect(Collectors.toSet());
        try {

            Company updatedCompany = companyService.updateCompany(company, companyDTO.name(), departments);
            CompanyDTO dto = companyMapper.map(updatedCompany);
            return ResponseEntity.ok(dto);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCompany(@PathVariable Long id) {
        companyService.deleteCompanyById(id);
        return ResponseEntity.noContent().build();
    }
}

