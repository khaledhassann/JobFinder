package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Job {
    static Scanner scanner = new Scanner(System.in);
    private String JobTitle;
    private Company company;
    static ArrayList<Job> allJobs = new ArrayList<>();
    private ArrayList<Application> applications;

    private int job_vacancy;


    public Job(String jobTitle, int job_vacancy , Company company) {
        JobTitle = jobTitle;
        this.job_vacancy = job_vacancy;
        applications = new ArrayList<>();
        allJobs.add(this);
    }

    public Job(String jobTitle, int job_vacancy) {
        JobTitle = jobTitle;
        this.job_vacancy = job_vacancy;
    }

    public String getJobTitle() {
        return JobTitle;
    }
    static Job getJob(int n) {
        return allJobs.get(n);
    }
    static Job getJob(String jobTitle){
        for(Job job:allJobs){
            if(job.getJobTitle().equals(jobTitle)){
                return job;
            }

        }
        return null;
    }
    static void addApplication(int n ,Application application){
        allJobs.get(n).applications.add(application);
    }

    public void viewApplications(){
        int i = 0;
        for(Application application: applications){
            System.out.println("Application no. "+i);
            application.viewApplication();
            System.out.println("--------------------");
            i++;
        }
    }

    public int getJob_vacancy() { return job_vacancy; }

    public void acceptApplication(int n){
        applications.get(n-1).accept();
    }

    static void leaveReview(int n){
        System.out.println("please leave a review between 0 and 5");
        double input = Double.valueOf(scanner.nextLine());
        allJobs.get(n).company.addReview(input);
    }
    public Company getCompany(){
        return company;
    }

    static void viewJobs(){
        int i=0;
        for(Job job : allJobs){
            System.out.println(i+"Job Title: "+job.getJobTitle()+"\n"+"Job vacancies: "+job.job_vacancy+"\n"+"Company name: "+job.company+"\n"+"Company review: "+job.company.getReview()+"\n"+"----------------------");
             i++;
        }


    }
    public void removeApplication(Job_Seeker jobSeeker){
        for(Application app :applications ){
            if(app.getJobSeeker().equals(jobSeeker)){
                applications.remove(app);
            }
        }
    }


    // push temsah
}