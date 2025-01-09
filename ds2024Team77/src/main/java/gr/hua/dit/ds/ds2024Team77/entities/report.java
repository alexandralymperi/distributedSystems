package gr.hua.dit.ds.ds2024Team77.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

@Entity
public class report {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "reporter_id")
    private users reporter;

    @Column
    @NotBlank
    private String complaint;

    @Column
    @NotNull
    private Date date;

    @Column
    private String status;

    public report(users reporter, String complaint, Date date, String status) {
        this.reporter = reporter;
        this.complaint = complaint;
        this.date = date;
        this.status = "Pending";
    }

    public report() {

    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public users getReporter() {
        return reporter;
    }

    public void setReporter(users reporter) {
        this.reporter = reporter;
    }

    public String getComplaint() {
        return complaint;
    }

    public void setComplaint(String complaint) {
        this.complaint = complaint;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
