package com.HealthCareSupportTeam;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.HealthCareSupportTeam.HealthCareSupportTeam;

public interface HealthCareSupportTeamRepository extends MongoRepository<HealthCareSupportTeam, String> {
    // You can define custom query methods here if needed
}
