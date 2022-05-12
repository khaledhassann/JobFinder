package com.company;

import java.util.ArrayList;

public class Company {
    private String name;
    private Admin Admin;
    private ArrayList<Job_Poster> posters;
    private ArrayList<Double> Reviews;
    private ArrayList<Job> Jobs;
    private double review;

    private String Description;


    public Company(String name, double review, Job job1, Job job2, Job job3, Job job4, Job job5, Job job6) {
        Jobs = new ArrayList<>();
        posters = new ArrayList<>();
        this.name = name;
        this.review = review;
        Jobs.add(job1);
        Jobs.add(job2);
        Jobs.add(job3);
        Jobs.add(job4);
        Jobs.add(job5);
        Jobs.add(job6);
    }
    public Company(String name, double review, String description){
        Jobs = new ArrayList<>();
        posters = new ArrayList<>();
        this.name = name;
        this.review = review;
        this.Description = description;
        Reviews = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public void addJob(Job job){
        Jobs.add(job);
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

    public void viewCompanyJobs(){}
    @Override
    public String toString(){
        return "Company name: " + this.getName() + "\n" +
                "Company description: " + this.getDescription();
    }

    public void displayPosters(){
        int n = 1;
        for(Job_Poster j: posters){
            System.out.println(n + "- Name: " + j.getName() +
                               ", Company: " + j.getCompany().getName());
            n++;
        }
    }
}
