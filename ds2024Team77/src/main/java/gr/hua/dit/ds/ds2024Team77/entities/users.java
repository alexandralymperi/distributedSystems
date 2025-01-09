package gr.hua.dit.ds.ds2024Team77.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.List;

@Entity
public class users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer Id;

    @Column
    @NotBlank
    private String name;

    @Column
    @NotBlank
    private String surname;

    @Column(unique = true)
    @NotBlank
    private String email;

    @Column
    @NotBlank
    private String password;

    @Column
    private String role;

    @Column
    private int penaltyPoints;

    @OneToMany(mappedBy = "sender", cascade = {CascadeType.DETACH, CascadeType.MERGE,
            CascadeType.PERSIST, CascadeType.PERSIST})
    private List<messages> sentMessages;

    @OneToMany(mappedBy = "receiver", cascade = {CascadeType.DETACH, CascadeType.MERGE,
            CascadeType.PERSIST, CascadeType.PERSIST})
    private List<messages> receivedMessages;

    @OneToMany(mappedBy = "reporter", cascade = {CascadeType.DETACH, CascadeType.MERGE,
            CascadeType.PERSIST, CascadeType.PERSIST})
    private List<report> reortsMade;

    @OneToMany(mappedBy = "reviewer", cascade = {CascadeType.DETACH, CascadeType.MERGE,
            CascadeType.PERSIST, CascadeType.PERSIST})
    private List<review> reportsLeft;

    @OneToMany(mappedBy = "reviewee", cascade = {CascadeType.DETACH, CascadeType.MERGE,
            CascadeType.PERSIST, CascadeType.PERSIST})
    private List<review> reportsConcerning;

    @OneToMany(mappedBy = "applicant", cascade = {CascadeType.DETACH, CascadeType.MERGE,
            CascadeType.PERSIST, CascadeType.PERSIST})
    private List<projectApplications> applications;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_profile_id", referencedColumnName = "Id")
    private userProfile profile;

    public users(String name, String surname, String email, String password, int penaltyPoints) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.role = "basic";
        this.penaltyPoints = penaltyPoints;
    }

    public users(Integer id, String name, String surname, String email) {
        Id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    public users() {

    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getPenaltyPoints() {
        return penaltyPoints;
    }

    public void setPenaltyPoints(int penaltyPoints) {
        this.penaltyPoints = penaltyPoints;
    }

    public List<messages> getSentMessages() {
        return sentMessages;
    }

    public void setSentMessages(List<messages> sentMessages) {
        this.sentMessages = sentMessages;
    }

    public List<messages> getReceivedMessages() {
        return receivedMessages;
    }

    public void setReceivedMessages(List<messages> receivedMessages) {
        this.receivedMessages = receivedMessages;
    }

    public List<report> getReortsMade() {
        return reortsMade;
    }

    public void setReortsMade(List<report> reortsMade) {
        this.reortsMade = reortsMade;
    }

    public List<review> getReportsLeft() {
        return reportsLeft;
    }

    public void setReportsLeft(List<review> reportsLeft) {
        this.reportsLeft = reportsLeft;
    }

    public List<review> getReportsConcerning() {
        return reportsConcerning;
    }

    public void setReportsConcerning(List<review> reportsConcerning) {
        this.reportsConcerning = reportsConcerning;
    }

    public List<projectApplications> getApplications() {
        return applications;
    }

    public void setApplications(List<projectApplications> applications) {
        this.applications = applications;
    }

    public userProfile getProfile() {
        return profile;
    }

    public void setProfile(userProfile profile) {
        this.profile = profile;
    }

    @Override
    public String toString() {
        return name + '\'' + surname + '\'';
    }
}
