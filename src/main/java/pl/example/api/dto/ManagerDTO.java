package pl.example.api.dto;

import lombok.Builder;
import lombok.With;

@With
@Builder

public record ManagerDTO(Long id, String name, String surname, String email, String phone) {
}
