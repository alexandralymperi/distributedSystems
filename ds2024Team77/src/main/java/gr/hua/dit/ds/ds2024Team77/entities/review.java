package gr.hua.dit.ds.ds2024Team77.entities;

import jakarta.persistence.*;


@Entity
public class review {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer Id;

    @Column(nullable = false)
    private int value;

    @Column
    private String comments;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "reviewer_id")
    private users reviewer;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "reviewee_id")
    private users reviewee;

    public review(Integer id, int value, String comments, users reviewer, users reviewee) {
        Id = id;
        this.value = value;
        this.comments = comments;
        this.reviewer = reviewer;
        this.reviewee = reviewee;
    }

    public review() {

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
