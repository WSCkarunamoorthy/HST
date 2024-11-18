package com.HealthCareSupportTeam;
import com.HealthCareSupportTeam.HealthCareSupportTeam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class HealthCareSupportTeamService {

    @Autowired
    private HealthCareSupportTeamRepository repository;

    // Get all HealthCareSupportTeam records
    public List<HealthCareSupportTeam> getAllTeams() {
        return repository.findAll();
    }

    // Get a specific HealthCareSupportTeam record by ID
    public Optional<HealthCareSupportTeam> getTeamById(String id) {
        return repository.findById(id);
    }

    // Create or update a HealthCareSupportTeam record
    public HealthCareSupportTeam saveTeam(HealthCareSupportTeam team) {
        return repository.save(team);
    }

    // Delete a HealthCareSupportTeam record by ID
    public void deleteTeam(String id) {
        repository.deleteById(id);
    }
}
