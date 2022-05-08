package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //t

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Username:");
        String username=scanner.nextLine();
        System.out.println("Enter Password:");
        String password=scanner.nextLine();

        User Habiba=new User("Habiba","Habiba10","123",20,"habiba@gmail.com");

        scanner.close();

        Habiba.validation(username,password);

    }
}
