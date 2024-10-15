package pl.example.api.dto;

import lombok.Builder;
import lombok.With;

import java.util.Set;
@With
@Builder

public record TeamDTO(Long id, String name, DepartmentDTO departmentDTO, Set<ProjectDTO> projects) {
}
