package pl.example.business.dao;

import pl.example.domain.Manager;
import pl.example.domain.Project;
import pl.example.domain.Team;

import java.util.List;
import java.util.Optional;

public interface ProjectDAO {
    Optional<Project> findProjectById(Long id);

    Project saveProject(Project project);

    void deleteProjectById(Long id);

    List<Project> findAllProjects();

    void updateProject(Project project, String name, Manager manager, Team team);

}
