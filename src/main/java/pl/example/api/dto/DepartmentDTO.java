package pl.example.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.With;

import java.util.Set;

@With
@Builder

public record DepartmentDTO (Long id, String name, CompanyDTO companyDTO, Set<TeamDTO> teams){
}
