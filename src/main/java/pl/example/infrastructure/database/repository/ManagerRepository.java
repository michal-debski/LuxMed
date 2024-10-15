package pl.example.infrastructure.database.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import pl.example.business.dao.ManagerDAO;
import pl.example.domain.Manager;
import pl.example.infrastructure.database.repository.jpa.ManagerJpaRepository;
import pl.example.infrastructure.database.repository.mapper.ManagerEntityMapper;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class ManagerRepository implements ManagerDAO {

    private final ManagerJpaRepository managerJpaRepository;
    private final ManagerEntityMapper managerEntityMapper;
    @Override
    public Manager saveManager(Manager manager) {
        return managerEntityMapper.mapFromEntity(managerJpaRepository
                .save(managerEntityMapper.mapToEntity(manager)));
    }

    @Override
    public void deleteManagerById(Long id) {
        managerJpaRepository.deleteById(id);
    }

    @Override
    public Optional<Manager> findById(Long id) {
        return managerJpaRepository.findById(id)
                .map(managerEntityMapper::mapFromEntity);
    }

    @Override
    public void updateManager(Manager manager, String name, String surname, String phone, String email) {

        manager.setName(name);
        manager.setSurname(surname);
        manager.setPhoneNumber(phone);
        manager.setEmail(email);
        managerJpaRepository.save(managerEntityMapper.mapToEntity(manager));
    }


}
