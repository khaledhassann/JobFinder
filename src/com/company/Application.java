package com.company;

public class Application {
    private Resume resume;
    private Company company;
    private Job job;
    private boolean applicationstatus;

    public Application(Resume resume) {
        this.resume = resume;
    }

    public Resume getResume() {
        return resume;
    }

    public void setResume(Resume resume) {
        this.resume = resume;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public boolean isApplicationstatus() {
        return applicationstatus;
    }

    public void setApplicationstatus(boolean applicationstatus) {
        this.applicationstatus = applicationstatus;
    }

}
