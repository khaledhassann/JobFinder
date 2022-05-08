package com.company;

import java.util.ArrayList;

public class Job_Poster {
    private Company company;
    ArrayList<Job> jobs;

    public Job_Poster(Company company) {
        this.company = company;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public ArrayList<Job> getJobs() {
        return jobs;
    }

    public void setJobs(ArrayList<Job> jobs) {
        this.jobs = jobs;
    }
    public void view(){

    }
    public void accept(){

    }
    public void reject(){

    }

}

