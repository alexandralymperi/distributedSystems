package gr.hua.dit.ds.ds2024Team77.entities;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class projectApplications {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    @ManyToOne
    @JoinColumn(name = "project_id", nullable = false)
    private project project;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private users applicant;

    @Column
    private String status;

    @Column
    private Date applicationDate;

    public projectApplications(gr.hua.dit.ds.ds2024Team77.entities.project project, users applicant, String status, Date applicationDate) {
        this.project = project;
        this.applicant = applicant;
        this.status = "Pending";
        this.applicationDate = applicationDate;
    }

    public projectApplications() {

    }

    // Getters και Setters
    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        this.Id = id;
    }

    public project getProject() {
        return project;
    }

    public void setProject(project project) {
        this.project = project;
    }

    public users getApplicant() {
        return applicant;
    }

    public void setApplicant(users applicant) {
        this.applicant = applicant;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(Date applicationDate) {
        this.applicationDate = applicationDate;
    }
}

