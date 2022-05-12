package com.company;

import java.util.ArrayList;
import java.util.Scanner;


public class Job_Poster extends User{

    Controller c1 = new Controller();

    static Scanner scanner = new Scanner(System.in);
    private Company company;
    static private ArrayList<Job> jobs;
    static ArrayList<String> Username=new ArrayList<String>();
    static ArrayList<Job_Poster> JobPosters=new ArrayList<>();
    static ArrayList<String> Password=new ArrayList<String>();

    public Job_Poster(String name, String username, String password, int age, String email, Company company) {
        super(name,username,password,age, email);
        this.company = company;
        jobs = new ArrayList<>();
        Username.add(username);
        Password.add(password);
        JobPosters.add(this);
        this.company.addPoster(this);
    }

    public static void setJobs(ArrayList<Job> jobs) {
        Job_Poster.jobs = jobs;
    }

    static Job_Poster findJobPoster(String username){
        for(Job_Poster jobPoster:JobPosters){
            if(jobPoster.getUsername().equals(username)){
                return jobPoster;
            }
        }
        return null;
    }
    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    static public ArrayList<Job> getJobs() {
        return jobs;
    }

    public void addJob() {
        System.out.println("Please specify job title:");
        String jobTitle = scanner.nextLine();
        System.out.println("Please specify job vacancy (in numbers):");
        int job_vacancy;
        while(true){
            try{
                job_vacancy = Integer.parseInt(scanner.nextLine());
                break;
            } catch(NumberFormatException e){
                System.out.println("Please re-enter vacancy in numbers: ");
                continue;
            }
        }


        this.company.addJob(new Job(jobTitle, job_vacancy , this.company));
//        jobs.add(new Job(jobTitle, job_vacancy , this.company));
        this.options();
    }
    public void view(){
        viewApplications();
        System.out.println("Specify the name of which job applications to view :");
        String name = scanner.nextLine();
        for(Job job: this.company.getJobs()){
            if(job.getJobTitle().equals(name)){
                if(job.getApplications().size() == 0){
                    System.out.println("No applications for this job just yet!");
                } else{
                    job.viewApplications();
                    this.accept(job);
                }
            }
        }
        this.options();


    }

    public void viewApplications(){
        int n =1;
        for(Job job: this.company.getJobs()){
            System.out.println(n+"- "+job.getJobTitle()+" "+job.getApplications().size());
            n++;
        }

    }

    public void accept(Job job ){
        System.out.print("Enter the application number you want to accept , if you want to exit type -1: ");
        while(true){
            int num = Integer.parseInt(scanner.nextLine());
            if (num==-1){
                return;
            } else if (num == 0 || num < -1){
                System.out.print("Invalid option please re-enter: ");
                continue;
            } else{
                job.acceptApplication(num);
                return;
            }
        }




    }
     public void options() {

         while (true) {
             System.out.println(
                     "****************Job Poster Options menu ****************\n" +
                             "1- Add jobs\n" +
                             "2- View applications\n" +
                             "3- Back to login menu" + "\n" +
                             "Please choose a number: "
             );

             try{
                 int input = Integer.parseInt(scanner.nextLine());
                 if (input == 1) {
                     this.addJob();
                 } else if (input == 2) {
                     this.view();
                 } else if (input == 3){
                     Controller.showOptions(Controller.login());
                 } else{
                     System.out.println("Invalid choice");
                     System.out.println("-------------------------------------------------");
                     options();
                 }
             } catch(NumberFormatException e) {
                 System.out.println("Invalid choice");
                 System.out.println("-------------------------------------------------");
                 options();
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

