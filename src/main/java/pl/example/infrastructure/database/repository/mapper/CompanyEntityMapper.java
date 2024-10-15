package pl.example.infrastructure.database.repository.mapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import pl.example.infrastructure.database.entity.CompanyEntity;
import pl.example.domain.Company;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CompanyEntityMapper {

    CompanyEntity mapToEntity(Company company);

    Company mapFromEntity(CompanyEntity companyEntity);
}
