package pl.example.domain;

import lombok.*;

@Builder
@Data
@Getter
@Setter
@With
public class Manager {
    Long id;

    String name;
    String surname;
    String email;
    String phoneNumber;
}
