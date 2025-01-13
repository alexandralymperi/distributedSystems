package gr.hua.dit.ds.ds2024Team77.service;

import gr.hua.dit.ds.ds2024Team77.entities.Messages;
import gr.hua.dit.ds.ds2024Team77.entities.Project;
import gr.hua.dit.ds.ds2024Team77.entities.User;
import gr.hua.dit.ds.ds2024Team77.repository.ProjectRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    private ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Transactional
    public Project getProject(Integer id){return projectRepository.findById(id).get();}

    @Transactional
    public void saveProject(Project project){
        projectRepository.save(project);
    }

    @Transactional
    public List<Project> getProjects(){ return projectRepository.findAll(); }

    @Transactional
    public void assignFreelancerToProject(int projectId, User freelancer){
        Project project = projectRepository.findById(projectId).get();
        project.setFreelancer(freelancer);
        projectRepository.save(project);
    }

    @Transactional
    public List<Project> getProjectsByStatus(String status) {
        return projectRepository.findProjectsByStatus(status);
    }

    @Transactional
    public void deleteProject(Integer id) {
        projectRepository.deleteById(id);
    }

    @Transactional
    public void approveProject(Integer id) {
        Project project = projectRepository.findById(id).get();
        project.setStatus("APPROVED");
        projectRepository.save(project);
    }

    @Transactional
    public void changeProjectStatusToOngoing(Integer id) {
        Project project = projectRepository.findById(id).get();
        project.setStatus("ONGOING");
        projectRepository.save(project);
    }

    @Transactional
    public List<Project> getProjectsByFreelancer_Id(Integer freelancerId) {
        return projectRepository.findProjectsByFreelancer_Id(freelancerId);
    }

    @Transactional
    public List<Project> getProjectsBycCustomer(Integer customerId) {
        return projectRepository.findProjectsByCustomer_Id(customerId);
    }

}
