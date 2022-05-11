package com.company;

import javax.print.attribute.standard.JobState;
import java.util.ArrayList;
import java.util.Scanner;
public class Controller {


    public Controller(){}

            static Job SoftwareGoogle = new Job("Software Engineer", 4);
            static Job AccountantGoogle = new Job("Accountant", 3);
            static Job ManagerGoogle = new Job("Manager", 5);
            static Job HRGoogle = new Job("HR", 5);
            static Job DesignerGoogle = new Job("Designer", 7);
            static Job AnalystGoogle = new Job("Analyst", 6);


            static Job SoftwareAmazon = new Job("Software Engineer", 7);
            static Job AccountantAmazon = new Job("Accountant", 2);
            static Job ManagerAmazon = new Job("Manager", 4);
            static Job HRAmazon = new Job("HR", 2);
            static Job DesignerAmazon = new Job("Designer", 4);
            static Job AnalystAmazon = new Job("Analyst", 5);


            static Job SoftwareMicrosoft = new Job("Software Engineer", 7);
            static Job AccountantMicrosoft = new Job("Accountant", 2);
            static Job ManagerMicrosoft = new Job("Manager", 4);
            static Job HRMicrosoft = new Job("HR", 2);
            static Job DesignerMicrosoft = new Job("Designer", 4);
            static Job AnalystMicrosoft = new Job("Analyst", 5);

            static Job SoftwareIBM = new Job("Software Engineer", 6);
            static Job AccountantIBM = new Job("Accountant", 3);
            static Job ManagerIBM = new Job("Manager", 5);
            static Job HRIBM = new Job("HR", 3);
            static Job DesignerIBM = new Job("Designer", 7);
            static Job AnalystIBM = new Job("Analyst", 6);

            static Job SoftwareSiemens = new Job("Software Engineer", 4);
            static Job AccountantSiemens = new Job("Accountant", 2);
            static Job ManagerSiemens = new Job("Manager", 4);
            static Job HRSiemens = new Job("HR", 5);
            static Job DesignerSiemens = new Job("Designer", 2);
            static Job AnalystSiemens = new Job("Analyst", 6);


            static Company Google = new Company("Google", 4.5, SoftwareGoogle, AccountantGoogle, HRGoogle, ManagerGoogle, DesignerGoogle, AnalystGoogle);
            static Company Amazon = new Company("Amazon", 4.7, SoftwareAmazon, AccountantAmazon, HRAmazon, ManagerAmazon, DesignerAmazon, AnalystAmazon);
            static Company Microsoft = new Company("Microsoft", 5.0, SoftwareMicrosoft, AccountantMicrosoft, ManagerMicrosoft, HRMicrosoft, DesignerMicrosoft, AnalystMicrosoft);
            static Company IBM = new Company("IBM", 6.0, SoftwareIBM, AccountantIBM, HRIBM, ManagerIBM, DesignerIBM, AnalystIBM);
            static Company Siemens = new Company("Siemens", 5.5, SoftwareSiemens, AccountantSiemens, HRSiemens, ManagerSiemens, DesignerSiemens, AnalystSiemens);

    static Admin Habiba = new Admin("Habiba", "Habiba10", "123", 20, "habiba@gmail.com", Google);
    static Job_Seeker Khaled = new Job_Seeker("khaled", "Khaled10", "1234", 20, "habiba@gmail.com");
    static Job_Poster Omar = new Job_Poster("Omar", "Omar10", "12345", 20, "habiba@gmail.com", Google);


    static Scanner scanner = new Scanner(System.in);
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
