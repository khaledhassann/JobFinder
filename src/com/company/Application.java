package com.company;

public class Application {
    private Job_Seeker jobSeeker;

    private boolean accepted;
    public Application(Job_Seeker jobSeeker) {
        this.jobSeeker=jobSeeker;
        accepted = false;
    }
    public void accept(){
        this.accepted = true;
        System.out.println("Application approved!");
    }
    public void viewApplication(){
        System.out.println(jobSeeker.getResume());
        if(accepted){
            System.out.println("Status: Accepted");
        } else{
            System.out.println("Status: Pending");
        }
    }
    public Job_Seeker getJobSeeker(){
        return this.jobSeeker;
    }



}
