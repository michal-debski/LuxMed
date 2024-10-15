package pl.example.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.With;

import java.util.Set;
@With
@Builder

public record CompanyDTO(Long id, String name, Set<DepartmentDTO> departments) {
}
