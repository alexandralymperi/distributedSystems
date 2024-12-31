package gr.hua.dit.ds.ds2024Team77.entities;

import java.awt.*;
import java.util.Date;

public class messages {

    private users sender;
    private users receiver;
    private String contents;
    private Date date;

    public messages(users sender, users receiver, String contents, Date date) {
        this.sender = sender;
        this.receiver = receiver;
        this.contents = contents;
        this.date = date;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
