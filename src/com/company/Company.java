package com.company;

import java.util.ArrayList;

public class Company {
    private String name;
    private Admin Admin;
    private ArrayList<Job_Poster> posters;
    private ArrayList<Double> Reviews;
    private ArrayList<Job> Jobs;

    private String Description;


    public Company() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Admin getAdmin() {
        return Admin;
    }

    public void setAdmin(Admin admin) {
        Admin = admin;
    }

    public ArrayList<Job_Poster> getPosters() {
        return posters;
    }

    public void setPosters(ArrayList<Job_Poster> posters) {
        this.posters = posters;
    }

    public ArrayList<Double> getReviews() {
        return Reviews;
    }

    public void addReview(double reviews) {
        Reviews.add(reviews);
    }

    public ArrayList<Job> getJobs() {
        return Jobs;
    }

    public void setJobs(ArrayList<Job> jobs) {
        Jobs = jobs;
    }

    public Double getReview() {
        double sum = 0 ;
        for(double review : Reviews){
            sum = review + sum;
        }
        return sum/Reviews.size();
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
    public void addPoster(Job_Poster poster){
        posters.add(poster);
    }
}
