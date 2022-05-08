package com.company;

import java.util.Scanner;

public class Main {
    static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        login();

    }
    static void login(){
        System.out.println("Enter Username:");
        String username=scanner.nextLine();
        System.out.println("Enter Password:");
        String password=scanner.nextLine();
        Company company = new Company();
        Admin Habiba=new Admin("Habiba","Habiba10","123",20,"habiba@gmail.com" , company);
        Admin khaled=new Admin("khaled","Khaled10","321",20,"habiba@gmail.com" , company);
        scanner.close();


        if(khaled.validation(username,password)==true){
            System.out.println("Logged in!");
            return;
        }
        System.out.println("Invalid");
    }
}
