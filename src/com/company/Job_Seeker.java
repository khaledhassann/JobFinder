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


        public Job_Seeker(String name, String username, String password, int age, String email, int experience, String skills ) {
            super(name,username,password,age, email);
            Username.add(username);
            Password.add(password);
            jobSeekers.add(this);
            appliedJobs = new ArrayList<>();
            resume = new Resume();
            this.resume.setName(name);
            this.resume.setAge(age);
            this.resume.setEmail(email);
            this.resume.setExperience(experience);
            this.resume.setSkills(skills);
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
            while(true){
                int input = Integer.parseInt(scanner.nextLine());
                if(input==-1){
                    options();
                } else if(input > Job.getAllJobs().size() || input == 0 || input < -1) {
                    System.out.println("This job doesn't exist!");
                    continue;
                } else {
                    this.apply(input);
                    System.out.println("success!");
                    break;
                }
            }


            options();
        }

        public void apply(int n){

            Job.addApplication(n-1,new Application(this));
            appliedJobs.add(Job.getJob(n - 1).getJobTitle());
            //Job j = Job_Poster.getJobs().get(n-1);
            //Job_Poster.getJobs().add(j);
            Job.leaveReview(n-1);
            System.out.println(Job.getAllJobs().get(n-1).getApplications().size());
            //options();
        }


        public void update(){
            System.out.println(this.getResume());
            this.setResume();
        }
        public void remove(){

            if(appliedJobs.size() == 0){
                System.out.println("You have no applications right now!");
                options();
            } else {
                int i = 1;
                for(String appliedJob:appliedJobs){
                    System.out.println(i+"- "+appliedJob);
                    i++;
                }
                System.out.print("Choose what you want delete: ");
                int n = Integer.parseInt(scanner.nextLine());
                if(n <= 0 || n > appliedJobs.size()){
                    System.out.println("Invalid option!");
                    options();
                } else {
                    Job.getJob(appliedJobs.get(n-1)).removeApplication(this);
                    appliedJobs.remove(n-1);
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
        public  void options(){
            System.out.println("1- Browse job posts & apply "+"\n"+"2- Update resume"+"\n"+"3- Remove application"+"\n" +
                    "4- Back to login menu");
            System.out.println("Please enter option number");
            Scanner scanner = new Scanner(System.in);
            try{
                int input = Integer.parseInt(scanner.nextLine());

                if(input==1){
                    this.Browse();
                } else if(input==2){
                    this.update();
                } else if(input==3){
                    this.remove();
                } else if(input == 4){
//                    Job.allJobs.clear();
                    Controller.showOptions(Controller.login());
                } else{
                    System.out.println("Invalid choice");
                    System.out.println("-------------------------------------------------");
                    options();
                }
            } catch (NumberFormatException e){
                System.out.println("Invalid choice");
                System.out.println("-------------------------------------------------");
                options();
            }

        }


    }


