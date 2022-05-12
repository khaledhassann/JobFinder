package com.company;

import java.util.ArrayList;
import java.util.Scanner ;

public class Admin extends User {
    static Scanner scanner = new Scanner(System.in);
    private Company company;

    static ArrayList<String> Username = new ArrayList<>();
    static ArrayList<Admin> Admins = new ArrayList<>();
    static ArrayList<String> Password = new ArrayList<>();


    public Admin(String name, String username, String password, int age, String email, Company company) {
        super(name,username,password,age, email);
        this.company = company;
        Username.add(username);
        Password.add(password);
        Admins.add(this);
    }

    static Admin findAdmin(String username){
        for(Admin admin:Admins){
            if(admin.getUsername().equals(username)){
                return admin;
            }
        }
        return null;
    }
    public void options(){

        System.out.println(
                "**************** Admin Options menu ****************\n" +
                        "1- Add job poster\n" +
                        "2- Change company info\n" +
                        "3- Back to login menu" + "\n" +
                        "Please choose a number: "
        );

        try{
            int input = Integer.parseInt(scanner.nextLine());
            if(input==1){
                this.Addposter();
            } else if(input==2){
                this.ChangeInfo();
            } else if(input == 3){
                Controller.showOptions(Controller.login());
            } else{
                System.out.println("Invalid choice");
                System.out.println("-------------------------------------------------");
                options();
            }
        } catch (NumberFormatException e){
            System.out.println("Invalid choice!");
            System.out.println("-------------------------------------------------");
            options();
        }


    }

    public Company getCompany() {
        return company;
    }


    public void Addposter(){
        this.company.displayPosters();
        System.out.print("Please enter Poster's name:");
        String name = scanner.nextLine();

        System.out.print("Please enter Poster's username:");
        String username = scanner.nextLine();

        System.out.print("Please enter Poster's password:");
        String password = scanner.nextLine();

        int age;
        System.out.print("Please enter Poster's age:");
        while(true){
            try{
                age = Integer.parseInt(scanner.nextLine());
                break;
            } catch(NumberFormatException e) {
                System.out.print("Please re-enter right age: ");
                continue;
            }
        }


        System.out.print("Please enter Poster's email:");
        String email = scanner.nextLine();

        new Job_Poster(name,  username,  password,  age,  email, getCompany());
        this.options();
    }
    public void ChangeInfo(){

        System.out.println(this.getCompany());

        System.out.println("Choose what you want to change:\n"+"1.Change company name.\n"+"2.Change company description");
        String n = scanner.nextLine();
        if(n.equals("1")){
            System.out.print("Enter company name:");
            String name = scanner.nextLine();
            company.setName(name);
        } else if(n.equals("2")){
            System.out.print("Enter company description:");
            String desc = scanner.nextLine();
            company.setDescription(desc);
        } else {
            System.out.println("Invalid choice!");
            System.out.println("-------------------------------------------------");
            ChangeInfo();
        }
        this.options();
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



}
