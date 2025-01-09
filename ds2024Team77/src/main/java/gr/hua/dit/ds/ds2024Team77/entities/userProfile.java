package gr.hua.dit.ds.ds2024Team77.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

@Entity
@Table
public class userProfile {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    @OneToOne(mappedBy = "profile", cascade = {CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.DETACH, CascadeType.MERGE})
    private naUser user;

    @Column
    private String bio;

    @Column
    private String phoneNumber;

    @Column
    @Size(max = 50)
    private String address;

    public userProfile(naUser user, String bio, String phoneNumber, String address) {
        this.user = user;
        this.bio = bio;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public userProfile() {

    }

    public naUser getUser() {
        return user;
    }

    public void setUser(naUser user) {
        this.user = user;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
