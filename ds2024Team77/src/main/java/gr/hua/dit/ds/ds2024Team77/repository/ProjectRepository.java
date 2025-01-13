package gr.hua.dit.ds.ds2024Team77.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import gr.hua.dit.ds.ds2024Team77.entities.Project;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {
    List<Project> findProjectsByStatus(String status);
    List<Project> findProjectsByFreelancer(Integer freelancerId);
    List<Project> findProjectsByOwner(Integer ownerId);



}
