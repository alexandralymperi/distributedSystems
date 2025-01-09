package gr.hua.dit.ds.ds2024Team77.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

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
    private naUser applicant;

    @Column
    @NotBlank
    private String status;

    @Column
    private Date applicationDate;

    public projectApplications(gr.hua.dit.ds.ds2024Team77.entities.project project, naUser applicant, String status, Date applicationDate) {
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

    public naUser getApplicant() {
        return applicant;
    }

    public void setApplicant(naUser applicant) {
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

