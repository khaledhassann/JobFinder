package com.company;

import java.util.ArrayList;

    public class Job_Seeker extends User {
        private Resume resume;
        ArrayList<Application> applications;
        static ArrayList<String> Username=new ArrayList<String>();
        static ArrayList<String> Password=new ArrayList<String>();


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

    }


