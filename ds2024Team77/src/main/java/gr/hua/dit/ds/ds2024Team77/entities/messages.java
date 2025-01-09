package gr.hua.dit.ds.ds2024Team77.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.Date;


@Entity
public class messages {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "sender_id")
    private naUser sender;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "receiver_id")
    private naUser receiver;

    @Column
    @NotBlank
    private String contents;

    @Column
    private String status;

    @Column
    private Date date;

    public messages(naUser sender, naUser receiver, String contents, String status, Date date) {
        this.sender = sender;
        this.receiver = receiver;
        this.contents = contents;
        this.status = "Delivered";
        this.date = date;
    }

    public messages() {

    }

    public naUser getSender() {
        return sender;
    }

    public void setSender(naUser sender) {
        this.sender = sender;
    }

    public naUser getReceiver() {
        return receiver;
    }

    public void setReceiver(naUser receiver) {
        this.receiver = receiver;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return  contents + '\'' ;
    }
}
