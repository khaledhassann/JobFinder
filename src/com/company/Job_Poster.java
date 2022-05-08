package com.company;

import java.util.ArrayList;

public class Job_Poster extends User{
    private Company company;
    ArrayList<Job> jobs;
    static ArrayList<String> Username=new ArrayList<String>();
    static ArrayList<String> Password=new ArrayList<String>();

    public Job_Poster(String name, String username, String password, int age, String email, Company company) {
        super(name, age, email);
        this.company = company;
        Username.add(username);
        Password.add(password);
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

    public void addJob(Job jobs) {


    }
    public void view(){

    }
    public void accept(){

    }
    public void reject(){

    }
    static boolean validation(String username,String password){
        int i = 0;
        for(String un : Username){
            if(un.equals(username)){
                if(Password.get(i).equals(password)){
                    return true;
                }
            }
            i++;
        }
        return false;
    }
    static void options(){
        System.out.println("job poster options");
    }

}

