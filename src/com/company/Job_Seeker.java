package com.company;

import java.util.ArrayList;

    public class Job_Seeker extends User {
        private Resume resume;
        ArrayList<Application> applications;
        static ArrayList<String> Username=new ArrayList<String>();
        static ArrayList<String> Password=new ArrayList<String>();


        public Job_Seeker(String name, String username, String password, int age, String email, Resume resume) {
            super(name, age, email);
            this.resume = resume;
            Username.add(username);
            Password.add(password);
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
            System.out.println("job seeker options");
        }

    }


