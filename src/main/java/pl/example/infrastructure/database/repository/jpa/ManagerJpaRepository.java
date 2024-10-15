package pl.example.database.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.example.database.entity.ManagerEntity;

@Repository
public interface ManagerJpaRepository extends JpaRepository<ManagerEntity, Long> {
}
