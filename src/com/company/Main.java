package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Company company = new Company();
    static Admin Habiba = new Admin("Habiba", "Habiba10", "123", 20, "habiba@gmail.com", company);
    static Job_Seeker Khaled = new Job_Seeker("khaled", "Khaled10", "1234", 20, "habiba@gmail.com");
    static Job_Poster Omar = new Job_Poster("Omar", "Omar10", "12345", 20, "habiba@gmail.com", company);
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        showOptions(login());
    }
    static ArrayList<String> login(){
        ArrayList<String>inputs=new ArrayList<>();
        while(true) {
            System.out.println("Please specify the type of user:\n"+"1.Admin\n"+"2.Job Poster\n"+"3.Job Seeker\n");
             inputs.add(scanner.nextLine());
            if(!(inputs.get(0).equals("1")||inputs.get(0).equals("2")||inputs.get(0).equals("3"))){
                System.out.println("Invalid type of user");
                System.out.println("-------------------------------------------------");
                continue;
            }
            System.out.print("Enter Username:");
            String username = scanner.nextLine();
            inputs.add(username);
            System.out.print("Enter Password:");
            String password = scanner.nextLine();


            if(inputs.get(0).equals("1")){

                if (Admin.validation(username, password)) {
                    System.out.println("Logged in!");
                    return inputs ;
                }
                System.out.println("Invalid username or password , please try again.");
                System.out.println("-------------------------------------------------");
                continue;
            }
            if(inputs.get(0).equals("2")){
                if (Job_Poster.validation(username, password)) {
                    System.out.println("Logged in!");
                    return inputs;
                }
                System.out.println("Invalid username or password , please try again.");
                System.out.println("-------------------------------------------------");
                continue;
            }
            if(inputs.get(0).equals("3")){
                if (Job_Seeker.validation(username, password)) {
                    System.out.println("Logged in!");
                    return inputs;
                }

                System.out.println("Invalid username or password , please try again.");
                System.out.println("-------------------------------------------------");
                continue;
            }

        }
    }
    static void showOptions(ArrayList<String> inputs){

        if(inputs.get(0).equals("1")){
            Admin.findAdmin(inputs.get(1)).options();
        }
        if(inputs.get(0).equals("2")){
            Job_Poster.findJobPoster(inputs.get(1)).options();
        }
        if(inputs.get(0).equals("3")){
            Job_Seeker.findJobseeker(inputs.get(1)).options();
        }

    }

}
