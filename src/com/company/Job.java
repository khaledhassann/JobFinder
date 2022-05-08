package com.company;

import java.util.ArrayList;

public class Job {
    private String JobDescription;
    private String Requirement;
    private int Salary;
    private String Location;
    private String Benefits;
    private String Responsibilities_Duties;
    private String ExperienceDetails;
    private String JobTitle;
    private String WorkingHours;
    private ArrayList<Application> applications;



    public Job(String jobDescription, String requirement, int salary, String location, String benefits, String responsibilities_Duties, String experienceDetails, String jobTitle, String workingHours, ArrayList<Application> applications) {
        JobDescription = jobDescription;
        Requirement = requirement;
        Salary = salary;
        Location = location;
        Benefits = benefits;
        Responsibilities_Duties = responsibilities_Duties;
        ExperienceDetails = experienceDetails;
        JobTitle = jobTitle;
        WorkingHours = workingHours;
        this.applications = applications;
    }




    public String getJobDescription() {
        return JobDescription;
    }

    public String getRequirement() {
        return Requirement;
    }

    public int getSalary() {
        return Salary;
    }

    public String getLocation() {
        return Location;
    }

    public String getBenefits() {
        return Benefits;
    }

    public String getResponsibilities_Duties() {
        return Responsibilities_Duties;
    }

    public String getExperienceDetails() {
        return ExperienceDetails;
    }

    public String getJobTitle() {
        return JobTitle;
    }

    public String getWorkingHours() {
        return WorkingHours;
    }

    public ArrayList<Application> getApplications() {
        return applications;
    }

    public void setJobDescription(String jobDescription) {
        JobDescription = jobDescription;
    }

    public void setRequirement(String requirement) {
        Requirement = requirement;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public void setBenefits(String benefits) {
        Benefits = benefits;
    }

    public void setResponsibilities_Duties(String responsibilities_Duties) {
        Responsibilities_Duties = responsibilities_Duties;
    }

    public void setExperienceDetails(String experienceDetails) {
        ExperienceDetails = experienceDetails;
    }

    public void setJobTitle(String jobTitle) {
        JobTitle = jobTitle;
    }

    public void setWorkingHours(String workingHours) {
        WorkingHours = workingHours;
    }

    public void setApplications(ArrayList<Application> applications) {
        this.applications = applications;
    }
}

