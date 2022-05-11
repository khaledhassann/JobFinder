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
    }
    public void viewApplication(){
        System.out.println(jobSeeker.getResume());
        System.out.println("Status: "+accepted);
    }
    public Job_Seeker getJobSeeker(){
        return this.jobSeeker;
    }



}
