package gr.hua.dit.ds.ds2024Team77.entities;

import jakarta.persistence.*;
import java.util.Date;


@Entity
public class messages {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "sender_id")
    private users sender;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "receiver_id")
    private users receiver;

    @Column(nullable = false)
    private String contents;

    @Column
    private String status;

    @Column
    private Date date;

    public messages(users sender, users receiver, String contents, String status, Date date) {
        this.sender = sender;
        this.receiver = receiver;
        this.contents = contents;
        this.status = "Delivered";
        this.date = date;
    }

    public messages() {

    }

    public users getSender() {
        return sender;
    }

    public void setSender(users sender) {
        this.sender = sender;
    }

    public users getReceiver() {
        return receiver;
    }

    public void setReceiver(users receiver) {
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
