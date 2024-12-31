package gr.hua.dit.ds.ds2024Team77.entities;

import jakarta.persistence.*;

public class review {

    private Integer Id;

    private int value;

    private String comments;

    private users reviewer;
    private users reviewee;

    public review(Integer id, int value, String comments, users reviewer, users reviewee) {
        Id = id;
        this.value = value;
        this.comments = comments;
        this.reviewer = reviewer;
        this.reviewee = reviewee;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public users getReviewer() {
        return reviewer;
    }

    public void setReviewer(users reviewer) {
        this.reviewer = reviewer;
    }

    public users getReviewee() {
        return reviewee;
    }

    public void setReviewee(users reviewee) {
        this.reviewee = reviewee;
    }
}
