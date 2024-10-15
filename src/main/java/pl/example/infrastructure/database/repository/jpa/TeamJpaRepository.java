package pl.example.database.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.example.database.entity.TeamEntity;

@Repository
public interface TeamJpaRepository extends JpaRepository<TeamEntity, Long> {
}
