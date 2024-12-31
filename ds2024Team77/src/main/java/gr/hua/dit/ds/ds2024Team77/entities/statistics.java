package gr.hua.dit.ds.ds2024Team77.entities;

import java.util.ArrayList;

public class statistics {

    private int totalProjects;
    private ArrayList<project> completedProjects;
    private float AverageRating;

    public statistics(int totalProjects, ArrayList<project> completedProjects, float averageRating) {
        this.totalProjects = totalProjects;
        this.completedProjects = completedProjects;
        AverageRating = averageRating;
    }

    public int getTotalProjects() {
        return totalProjects;
    }

    public void setTotalProjects(int totalProjects) {
        this.totalProjects = totalProjects;
    }

    public ArrayList<project> getCompletedProjects() {
        return completedProjects;
    }

    public void setCompletedProjects(ArrayList<project> completedProjects) {
        this.completedProjects = completedProjects;
    }

    public float getAverageRating() {
        return AverageRating;
    }

    public void setAverageRating(float averageRating) {
        AverageRating = averageRating;
    }
}
