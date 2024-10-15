package pl.example.business.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.example.business.dao.ProjectDAO;
import pl.example.domain.Manager;
import pl.example.domain.Project;
import pl.example.domain.Team;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProjectService {


    private final ProjectDAO projectDAO;

    Optional<Project> findProjectById(Long id){
        return projectDAO.findProjectById(id);
    }
    Project saveProject(Project project){
        return projectDAO.saveProject(project);
    }

    void deleteProjectById(Long id){
        projectDAO.deleteProjectById(id);
    }

    List<Project> findAllProjects(){
        return projectDAO.findAllProjects();
    }

    void updateProject(Project project, String name, Manager manager, Team team){
        projectDAO.updateProject(project, name, manager, team);
    }

}
