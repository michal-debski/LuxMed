package pl.example.business.dao;

import pl.example.domain.Department;
import pl.example.domain.Manager;
import pl.example.domain.Project;
import pl.example.domain.Team;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface TeamDAO {

    Optional<Team> findTeamById(Long id);
    Team saveTeam(Team team);

    void deleteTeamById(Long id);

    List<Team> findAllTeams();
    void updateTeam(Team team, String name, Department department, Set<Project> projects);

}
