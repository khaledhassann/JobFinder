package com.company;

import java.util.Scanner;

public class Main {
    //comment
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        showOptions(login());
    }
    static String login(){
        while(true) {
            System.out.println("Please specify the type of user:\n"+"1.Admin\n"+"2.Job Poster\n"+"3.Job Seeker\n");
            String input = scanner.nextLine();
            if(!(input.equals("1")||input.equals("2")||input.equals("3"))){
                System.out.println("Invalid type of user");
                System.out.println("-------------------------------------------------");
                continue;
            }
            System.out.print("Enter Username:");
            String username = scanner.nextLine();
            System.out.print("Enter Password:");
            String password = scanner.nextLine();
            Company company = new Company();
            Resume resume = new Resume("anjax");

            Admin Habiba = new Admin("Habiba", "Habiba10", "123", 20, "habiba@gmail.com", company);
            Job_Seeker Khaled = new Job_Seeker("khaled", "Khaled10", "1234", 20, "habiba@gmail.com", resume);
            Job_Poster Omar = new Job_Poster("Omar", "Omar10", "12345", 20, "habiba@gmail.com", company);

            if(input.equals("1")){

                if (Admin.validation(username, password)) {
                    System.out.println("Logged in!");
                    return input;
                }
                System.out.println("Invalid username or password , please try again.");
                System.out.println("-------------------------------------------------");
                continue;
            }
            if(input.equals("2")){
                if (Job_Poster.validation(username, password)) {
                    System.out.println("Logged in!");
                    return input;
                }
                System.out.println("Invalid username or password , please try again.");
                System.out.println("-------------------------------------------------");
                continue;
            }
            if(input.equals("3")){
                if (Job_Seeker.validation(username, password)) {
                    System.out.println("Logged in!");
                    return input;
                }
                System.out.println("Invalid username or password , please try again.");
                System.out.println("-------------------------------------------------");
                continue;
            }

        }
    }
    static void showOptions(String n){

        if(n.equals("1")){
            Admin.options();
        }
        if(n.equals("2")){
            Job_Poster.options();
        }
        if(n.equals("3")){
            Job_Seeker.options();
        }

    }
}
