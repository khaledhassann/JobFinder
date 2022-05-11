package com.company;

import java.util.ArrayList;
import java.util.Scanner;


public class Job_Poster extends User{
    static Scanner scanner = new Scanner(System.in);
    private Company company;
    private ArrayList<Job> jobs;
    static ArrayList<String> Username=new ArrayList<String>();
    static ArrayList<String> Password=new ArrayList<String>();

    public Job_Poster(String name, String username, String password, int age, String email, Company company) {
        super(name, age, email);
        this.company = company;
        jobs = new ArrayList<>();
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

    public void addJob() {
        System.out.println("Please specify job title:");
        String jobTitle = scanner.nextLine();
        System.out.println("Please specify job vacancy (in numbers):");
        int job_vacancy = Integer.valueOf(scanner.nextLine());
        jobs.add(new Job(jobTitle, job_vacancy , this.company));
        this.options();
    }
    public void view(){
        int n = 0;
        System.out.println(jobs);
        System.out.println("Specify the name of which job applications to view :");
        String name = scanner.nextLine();
        for(Job job:jobs){
            if(job.getJobTitle().equals(name)){
                job.viewApplications();
                this.accept(job );
            }
        }
        this.options();


    }
    public void accept(Job job ){
        System.out.print("enter the application number you want to accept , if you want to exit type -1: ");
        int num = Integer.valueOf(scanner.nextLine());
        if (num==-1){
            return;
        }
        job.acceptApplication(num);
        return;


    }
     public void options() {

         while (true) {
             System.out.println(
                     "****************Job Poster Options menu ****************\n" +
                             "1- Add jobs\n" +
                             "2- View applications\n" +
                             "3- Accept/Reject applicants\n" +
                             "Please choose a number: "
             );


             int input = Integer.valueOf(scanner.nextLine());
             if (input == 1) {
                 this.addJob();
             }
             if (input == 2) {
                 this.view();
             }
             if (input == 3) {
                 this.view();
             }
         }

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



}

