package pl.example.infrastructure.database.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import pl.example.business.dao.ProjectDAO;
import pl.example.domain.Manager;
import pl.example.domain.Project;
import pl.example.domain.Team;
import pl.example.infrastructure.database.repository.jpa.ProjectJpaRepository;
import pl.example.infrastructure.database.repository.mapper.ProjectEntityMapper;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class ProjectRepository implements ProjectDAO {


    private final ProjectJpaRepository projectJpaRepository;
    private final ProjectEntityMapper projectEntityMapper;

    @Override
    public Optional<Project> findProjectById(Long id) {
        return projectJpaRepository.findById(id)
                .map(projectEntityMapper::mapFromEntity);
    }

    @Override
    public Project saveProject(Project project) {
        return projectEntityMapper.mapFromEntity(projectJpaRepository
                .save(projectEntityMapper.mapToEntity(project)));
    }

    @Override
    public void deleteProjectById(Long id) {

        projectJpaRepository.deleteById(id);
    }

    @Override
    public List<Project> findAllProjects() {
        return projectJpaRepository.findAll().stream()
                .map(projectEntityMapper::mapFromEntity).toList();
    }

    @Override
    public void updateProject(Project project, String name, Manager manager, Team team) {
        project.setName(name);
        project.setManager(manager);
        project.setTeam(team);
        projectJpaRepository.save(projectEntityMapper.mapToEntity(project));
    }
}
