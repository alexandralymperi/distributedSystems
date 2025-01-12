package gr.hua.dit.ds.ds2024Team77.service;

import gr.hua.dit.ds.ds2024Team77.entities.ProjectApplications;
import gr.hua.dit.ds.ds2024Team77.repository.ProjectApplicationsRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectApplicationsService {
    private ProjectApplicationsRepository projectApplicationsRepository;

    public ProjectApplicationsService(ProjectApplicationsRepository projectApplicationsRepository) {
        this.projectApplicationsRepository = projectApplicationsRepository;
    }

    @Transactional
    public ProjectApplications getProjectApplication(Integer id){return projectApplicationsRepository.findById(id).get();}

    @Transactional
    public void saveReview(ProjectApplications projectApplications){
        projectApplicationsRepository.save(projectApplications);
    }

    @Transactional
    public List<ProjectApplications> getProjectApplications(){ return projectApplicationsRepository.findAll(); }
}
