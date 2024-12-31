package gr.hua.dit.ds.ds2024Team77.entities;

import jakarta.persistence.*;
import java.util.Date;

public class report {


    private Integer Id;

    private Integer reporterId;

    private String complaint;

    private Date date;

    private String status;

    public report(Integer id, Integer reporterId, String complaint, Date date, String status) {
        Id = id;
        this.reporterId = reporterId;
        this.complaint = complaint;
        this.date = date;
        this.status = status;
    }

    public report() {

    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getReporterId() {
        return reporterId;
    }

    public void setReporterId(Integer reporterId) {
        this.reporterId = reporterId;
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

    public void setdate(Date sate) {
        this.date = sate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
