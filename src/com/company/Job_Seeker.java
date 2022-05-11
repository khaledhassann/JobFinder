package com.company;

import java.util.ArrayList;
import java.util.Scanner;

    public class Job_Seeker extends User {
        private Resume resume;
        private ArrayList<String> appliedJobs;
        static Scanner scanner = new Scanner (System.in);
        static ArrayList<Job_Seeker> jobSeekers=new ArrayList<>();
        static ArrayList<String> Username=new ArrayList<String>();
        static ArrayList<String> Password=new ArrayList<String>();


        public Job_Seeker(String name, String username, String password, int age, String email ) {
            super(name,username,password,age, email);
            Username.add(username);
            Password.add(password);
            jobSeekers.add(this);
        }

        public Resume getResume() {
            return resume;
        }
        static Job_Seeker findJobseeker(String username){
            for(Job_Seeker jobSeeker:jobSeekers){
                if(jobSeeker.getUsername().equals(username)){
                    return jobSeeker;
                }
            }

            return null;

        }
        public void setResume() {
            System.out.println("please enter years of experience:");
            int experience = Integer.valueOf(scanner.nextLine());
            System.out.println("please enter skills:");
            String skills = scanner.nextLine();
            System.out.println("Success");
            resume = new Resume( getName(), getEmail(), getAge(),experience,skills);

            options();
        }
        public void Browse(){

            Job.viewJobs();
            System.out.println("If you wish to apply specify job number , if you wish to go back press -1");
            int input = Integer.valueOf(scanner.nextLine());
            if(input==-1){
                options();
            }
            else{
                this.apply(input);
                System.out.println("success!");
            }
            options();
        }

        public void apply(int n){

            Job.addApplication(n-1,new Application(this));
            appliedJobs.add(Job.getJob(n).getJobTitle());
            Job.leaveReview(n-1);
            options();
        }


        public void update(){
            this.setResume();
        }
        public void remove(){
            int i = 1;
            for(String appliedJob:appliedJobs){
                System.out.println(i+" "+appliedJob);
                i++;
            }
            System.out.print("Choose what you want delete");
            int n = Integer.valueOf(scanner.nextLine());
            appliedJobs.remove(n-1);
            Job.getJob(appliedJobs.get(n-1)).removeApplication(this);
            options();


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
        public  void options(){
            System.out.println("1- Browse job posts & apply "+"\n"+ "2- Set resume" +"\n"+"3- Update resume"+"\n"+"Remove application");
            System.out.println("Please enter option number");
            Scanner scanner = new Scanner(System.in);
            int input = Integer.valueOf(scanner.nextLine());

            if(input==1){
                this.Browse();
            }
            if(input==2){
                this.setResume();
            }
            if(input==3){
                this.update();
            }
            if(input==4){
                this.remove();
            }




        }


    }


