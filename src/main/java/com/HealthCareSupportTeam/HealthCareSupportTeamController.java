package com.HealthCareSupportTeam;
import com.HealthCareSupportTeam.HealthCareSupportTeam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/healthcare-support-team")
public class HealthCareSupportTeamController {

    @Autowired
    private HealthCareSupportTeamService service;

    // Get all HealthCareSupportTeam records
    @GetMapping
    public List<HealthCareSupportTeam> getAllTeams() {
        return service.getAllTeams();
    }

    // Get a specific HealthCareSupportTeam record by ID
    @GetMapping("/{id}")
    public ResponseEntity<HealthCareSupportTeam> getTeamById(@PathVariable String id) {
        Optional<HealthCareSupportTeam> team = service.getTeamById(id);
        return team.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Create or update a HealthCareSupportTeam record
    @PostMapping
    public HealthCareSupportTeam createTeam(@RequestBody HealthCareSupportTeam team) {
        return service.saveTeam(team);
    }

    // Update a specific HealthCareSupportTeam record
    @PutMapping("/{id}")
    public ResponseEntity<HealthCareSupportTeam> updateTeam(@PathVariable String id, @RequestBody HealthCareSupportTeam teamDetails) {
        Optional<HealthCareSupportTeam> teamData = service.getTeamById(id);
        if (teamData.isPresent()) {
            HealthCareSupportTeam team = teamData.get();
            team.setNote(teamDetails.getNote());
            team.setAppoinmentdatetime(teamDetails.getAppoinmentdatetime());
            team.setCoordinatordetails(teamDetails.getCoordinatordetails());
            team.setFhedetails(teamDetails.getFhedetails());
            team.setVendordetails(teamDetails.getVendordetails());
            team.setRemaindercalltobeneficiary(teamDetails.getRemaindercalltobeneficiary());
            team.setRemaindercalltocoordinater(teamDetails.getRemaindercalltocoordinater());
            team.setPrimaryreport(teamDetails.getPrimaryreport());
            team.setInvestigationreport(teamDetails.getInvestigationreport());
            team.setConsulatant20minssession(teamDetails.getConsulatant20minssession());
            team.setFinalreporttoclient(teamDetails.getFinalreporttoclient());
            team.setchtmail(teamDetails.getChtmail());
            team.setFollowupcall(teamDetails.getFollowupcall());

            HealthCareSupportTeam updatedTeam = service.saveTeam(team);
            return ResponseEntity.ok(updatedTeam);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Delete a specific HealthCareSupportTeam record
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTeam(@PathVariable String id) {
        if (service.getTeamById(id).isPresent()) {
            service.deleteTeam(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
