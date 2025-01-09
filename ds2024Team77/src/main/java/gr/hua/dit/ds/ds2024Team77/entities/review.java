package gr.hua.dit.ds.ds2024Team77.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;


@Entity
public class review {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer Id;

    @Column
    @NotBlank
    private int value;

    @Column
    private String comments;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "reviewer_id")
    private naUser reviewer;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "reviewee_id")
    private naUser reviewee;

    public review(Integer id, int value, String comments, naUser reviewer, naUser reviewee) {
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

    public naUser getReviewer() {
        return reviewer;
    }

    public void setReviewer(naUser reviewer) {
        this.reviewer = reviewer;
    }

    public naUser getReviewee() {
        return reviewee;
    }

    public void setReviewee(naUser reviewee) {
        this.reviewee = reviewee;
    }

}
