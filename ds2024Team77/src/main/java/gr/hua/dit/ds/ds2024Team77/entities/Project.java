package gr.hua.dit.ds.ds2024Team77.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.List;

@Entity
public class Project {

    //Columns
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long Id;

    @Column(nullable = false)
    private String title;

    @Column
    @NotBlank
    private String description;

    @Column
    @NotBlank
    private float pay;

    @Column
    @NotBlank
    private String status;

    //Mappings
    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "customer_id")
    private User customer;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "freelancer_id")
    private User freelancer;

    @OneToMany(mappedBy = "project", cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.PERSIST})
    private List<ProjectApplications> applications;


    //Constructors
    public Project(String title, String description, float pay, String status, User customer, User freelancer) {
        this.title = title;
        this.description = description;
        this.pay = pay;
        this.status = "PENDING_APPROVAL";
        this.customer = customer;
        this.freelancer = freelancer;
    }

    public Project() {

    }

    //Setters & Getters
    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPay() {
        return pay;
    }

    public void setPay(float pay) {
        this.pay = pay;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public User getCustomer() {
        return customer;
    }

    public void setCustomer(User customer) {
        this.customer = customer;
    }

    public User getFreelancer() {
        return freelancer;
    }

    public void setFreelancer(User freelancer) {
        this.freelancer = freelancer;
    }

    public List<ProjectApplications> getApplications() {
        return applications;
    }

    public void setApplications(List<ProjectApplications> applications) {
        this.applications = applications;
    }
}
