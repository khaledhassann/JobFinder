package com.company;

import java.util.ArrayList;
import java.util.Scanner ;

public class Admin extends User {
    static Scanner scanner = new Scanner(System.in);
    private Company company;
    static ArrayList<String> Username = new ArrayList<String>();
    static ArrayList<String> Password = new ArrayList<String>();


    public Admin(String name, String username, String password, int age, String email, Company company) {
        super(name, age, email);
        this.company = company;
        Username.add(username);
        Password.add(password);
    }



    public Company getCompany() {
        return company;
    }


    public void Addposter(){
        System.out.print("Please enter Poster's name");
        String name = scanner.nextLine();

        System.out.print("Please enter Poster's username");
        String username = scanner.nextLine();

        System.out.print("Please enter Poster's password");
        String password = scanner.nextLine();

        System.out.print("Please enter Poster's age");
        int age = Integer.valueOf(scanner.nextLine());

        System.out.print("Please enter Poster's email");
        String email = scanner.nextLine();

        company.addPoster(new Job_Poster(name,  username,  password,  age,  email, getCompany()));
    }
    public void ChangeInfo(){

        System.out.println("Choose what you want to change:\n"+"1.Change company name.\n"+"2.Change company description");
        String n = scanner.nextLine();
        if(n.equals("1")){
            System.out.print("Enter company name:");
            String name = scanner.nextLine();
            company.setName(name);
        }
        if(n.equals("2")){
            System.out.print("Enter company description:");
            String desc = scanner.nextLine();
            company.setDescription(desc);
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
    static void options(){
        System.out.println("admin options");
    }


}
