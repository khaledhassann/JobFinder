package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Job_Seeker extends User {
        private Resume resume;
        ArrayList<Application> applications;

        public Job_Seeker(String name, String username, String password, int age, String email, Resume resume, ArrayList<Application> applications) {
            super(name, username, password, age, email);
            this.resume = resume;
            this.applications = applications;
        }

        public Job_Seeker(String name, Resume resume, ArrayList<Application> applications) {
            super(name);
            this.resume = resume;
            this.applications = applications;
        }

        public Job_Seeker(String name) {
            super(name);
        }

        public Resume getResume() {
            return resume;
        }

        public void setResume(Resume resume) {
            this.resume = resume;
        }
        public void Browse(){

        }
        public void AddReview(){

        }
        public void apply(){

        }
        public void update(){

        }
        public void delete(){

        }


        public static int options(){
            System.out.println("1- Browse Post "+"\n"+"2- Browse Company"+ "\n" +"3- Browse Review"+ "\n"+ "4- Add review"+
                    "\n"+ "5- Apply Job" + "\n"+ "6- update" +"\n"+"7- Delete");
            System.out.println("Please enter option number");
            Scanner scanner=new Scanner(System.in);
            int option_number=scanner.nextInt();
            System.out.println(option_number);
            return option_number;





        }

    }


