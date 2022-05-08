package com.company;

import java.util.ArrayList;

public class Company {
    private String name;
    private Admin Admin;
    private ArrayList<Job_Poster> posters;
    private ArrayList<Double> Reviews;
    private ArrayList<Job> Jobs;
    private Double Review;
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

    public void setReviews(ArrayList<Double> reviews) {
        Reviews = reviews;
    }

    public ArrayList<Job> getJobs() {
        return Jobs;
    }

    public void setJobs(ArrayList<Job> jobs) {
        Jobs = jobs;
    }

    public Double getReview() {
        return Review;
    }

    public void setReview(Double review) {
        Review = review;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
