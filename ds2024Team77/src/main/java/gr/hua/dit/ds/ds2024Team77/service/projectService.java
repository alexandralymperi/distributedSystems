package gr.hua.dit.ds.ds2024Team77.service;

import gr.hua.dit.ds.ds2024Team77.entities.project;
import gr.hua.dit.ds.ds2024Team77.entities.naUser;
import gr.hua.dit.ds.ds2024Team77.repository.projectRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class projectService {

    private projectRepository projectRepository;

    @Transactional
    public void assignFreelancerToProject(int projectId, naUser freelancer){
        project project = projectRepository.findById(projectId).get();
        project.setFreelancer(freelancer);
        projectRepository.save(project);
    }
}
