package pl.example.business.dao;

import pl.example.domain.Manager;

import java.util.Optional;

public interface ManagerDAO {

    Manager saveManager(Manager manager);
    void deleteManagerById(Long id);

    Optional<Manager> findById(Long id);

    void updateManager(Manager manager, String name, String surname, String phone, String email);
}
