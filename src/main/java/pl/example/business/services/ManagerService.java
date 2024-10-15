package pl.example.business.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.example.business.dao.ManagerDAO;
import pl.example.domain.Manager;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ManagerService {

    private final ManagerDAO managerDAO;

    Manager saveManager(Manager manager){
      return managerDAO.saveManager(manager);
    }
    void deleteManagerById(Long id){
        managerDAO.deleteManagerById(id);
    }

    Optional<Manager> findById(Long id){
       return managerDAO.findById(id);
    }

    void updateManager(Manager manager, String name, String surname, String phone, String email){
        managerDAO.updateManager(manager, name, surname, phone,email);
    }


}
