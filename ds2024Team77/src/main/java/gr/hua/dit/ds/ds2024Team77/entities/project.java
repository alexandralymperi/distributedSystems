package gr.hua.dit.ds.ds2024Team77.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class project {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer Id;

    @Column(nullable = false)
    private String title;

    @Column
    private String description;

    @Column(nullable = false)
    private float pay;

    @Column
    private String status;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "customer_id")
    private users customer;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "freelancer_id")
    private users freelancer;

    @OneToMany(mappedBy = "project", cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.PERSIST})
    private List<projectApplications> applications;

    public project(String title, String description, float pay, String status, users customer, users freelancer) {
        this.title = title;
        this.description = description;
        this.pay = pay;
        this.status = "inactive";
        this.customer = customer;
        this.freelancer = freelancer;
    }

    public project() {

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

    public users getCustomer() {
        return customer;
    }

    public void setCustomer(users customer) {
        this.customer = customer;
    }

    public users getFreelancer() {
        return freelancer;
    }

    public void setFreelancer(users freelancer) {
        this.freelancer = freelancer;
    }

    public List<projectApplications> getApplications() {
        return applications;
    }

    public void setApplications(List<projectApplications> applications) {
        this.applications = applications;
    }
}
