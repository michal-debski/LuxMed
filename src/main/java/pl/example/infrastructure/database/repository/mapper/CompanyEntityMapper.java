package pl.example.database.repository.mapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import pl.example.database.entity.CompanyEntity;
import pl.example.domain.Company;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CompanyEntityMapper {

    CompanyEntity mapToEntity(Company company);

    Company mapFromEntity(CompanyEntity companyEntity);
}
