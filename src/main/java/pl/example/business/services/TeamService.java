package pl.example.business.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.example.business.dao.TeamDAO;
import pl.example.domain.Department;
import pl.example.domain.Project;
import pl.example.domain.Team;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class TeamService {

    private final TeamDAO teamDAO;
    Optional<Team> findTeamById(Long id){
        return teamDAO.findTeamById(id);
    }
    Team saveTeam(Team team){
        return teamDAO.saveTeam(team);
    }

    void deleteTeamById(Long id){
        teamDAO.deleteTeamById(id);
    }

    List<Team> findAllTeams(){
        return teamDAO.findAllTeams();
    }
    void updateTeam(Team team, String name, Department department, Set<Project> projects){
        teamDAO.updateTeam(team, name, department, projects);
    }


}
