package gr.hua.dit.ds.ds2024Team77.entities;

import java.util.ArrayList;

public class project {

    private String title;
    private String description;
    private float pay;
    private String status;
    private users customer;
    private users freelancer;
    private ArrayList<users> applicants;


    public project(String title, String description, float pay, String status, users customer, users freelancer, ArrayList<users> applicants) {
        this.title = title;
        this.description = description;
        this.pay = pay;
        this.status = status;
        this.customer = customer;
        this.freelancer = freelancer;
        this.applicants = applicants;
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

    public ArrayList<users> getApplicants() {
        return applicants;
    }

    public void setApplicants(ArrayList<users> applicants) {
        this.applicants = applicants;
    }
}
