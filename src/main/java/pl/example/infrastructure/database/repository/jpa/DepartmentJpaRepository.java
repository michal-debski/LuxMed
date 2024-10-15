package pl.example.database.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.example.database.entity.DepartmentEntity;

@Repository
public interface DepartmentJpaRepository extends JpaRepository<DepartmentEntity, Long> {
}
