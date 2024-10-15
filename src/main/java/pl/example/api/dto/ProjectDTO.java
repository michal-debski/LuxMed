package pl.example.api.dto;

import lombok.Builder;
import lombok.With;

@With
@Builder

public record ProjectDTO(Long id, String name, TeamDTO teamDTO, ManagerDTO managerDTO) {
}
