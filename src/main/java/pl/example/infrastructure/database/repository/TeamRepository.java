package pl.example.infrastructure.database.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import pl.example.business.dao.TeamDAO;
import pl.example.domain.Department;
import pl.example.domain.Manager;
import pl.example.domain.Project;
import pl.example.domain.Team;
import pl.example.infrastructure.database.repository.jpa.TeamJpaRepository;
import pl.example.infrastructure.database.repository.mapper.TeamEntityMapper;

import java.util.List;
import java.util.Optional;
import java.util.Set;
@Repository
@RequiredArgsConstructor
public class TeamRepository implements TeamDAO {

    private final TeamEntityMapper teamEntityMapper;
    private final TeamJpaRepository teamJpaRepository;

    @Override
    public Optional<Team> findTeamById(Long id) {
        return teamJpaRepository.findById(id)
                .map(teamEntityMapper::mapFromEntity);
    }

    @Override
    public Team saveTeam(Team team) {
        return teamEntityMapper.mapFromEntity(teamJpaRepository
                .save(teamEntityMapper.mapToEntity(team)));

    }

    @Override
    public void deleteTeamById(Long id) {
            teamJpaRepository.deleteById(id);
    }

    @Override
    public List<Team> findAllTeams() {
        return teamJpaRepository.findAll().stream()
                .map(teamEntityMapper::mapFromEntity).toList();
    }

    @Override
    public void updateTeam(Team team, String name, Department department, Set<Project> projects) {
        team.setName(name);
        team.setDepartment(department);
        team.setProjects(projects);
    }
}
