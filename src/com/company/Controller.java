package com.company;

import javax.print.attribute.standard.JobState;
import java.util.ArrayList;
import java.util.Scanner;
public class Controller {

    static int num = 0;

            static Company Google = new Company("Google", 4.5, "This is Google's description");
            static Company Amazon = new Company("Amazon", 4.7, "This is Amazon's description");
            static Company Microsoft = new Company("Microsoft", 5.0, "This is Microsoft's description");
            static Company IBM = new Company("IBM", 6.0, "This is IBM's description");
            static Company Siemens = new Company("Siemens", 5.5, "This is Siemen's description");


    // Creating Amazon jobs
    static public void createAmazonJobs(){
        Job SoftwareAmazon = new Job("Software Engineer", 7, Amazon);
        Job AccountantAmazon = new Job("Accountant", 2, Amazon);
        Job ManagerAmazon = new Job("Manager", 4, Amazon);
        Job HRAmazon = new Job("HR", 2, Amazon);
        Job DesignerAmazon = new Job("Designer", 4, Amazon);
        Job AnalystAmazon = new Job("Analyst", 5, Amazon);
//        ArrayList<Job> amazonJobs = new ArrayList<>();
//        amazonJobs.add(SoftwareAmazon);
//        amazonJobs.add(AccountantAmazon);
//        amazonJobs.add(ManagerAmazon);
//        amazonJobs.add(HRAmazon);
//        amazonJobs.add(DesignerAmazon);
//        amazonJobs.add(AnalystAmazon);
//        return amazonJobs;
        Amazon.getJobs().add(SoftwareAmazon);
        Amazon.getJobs().add(AccountantAmazon);
        Amazon.getJobs().add(ManagerAmazon);
        Amazon.getJobs().add(HRAmazon);
        Amazon.getJobs().add(DesignerAmazon);
        Amazon.getJobs().add(AnalystAmazon);
    }
//    static public void setAmazonJobs(){
//        Amazon.setJobs(Controller.createAmazonJobs());
//    }

    // creating Google jobs
    static public void createGoogleJobs(){
        Job SoftwareGoogle = new Job("Software Engineer", 4, Google);
        Job AccountantGoogle = new Job("Accountant", 3, Google);
        Job ManagerGoogle = new Job("Manager", 5, Google);
        Job HRGoogle = new Job("HR", 5, Google);
        Job DesignerGoogle = new Job("Designer", 7, Google);
        Job AnalystGoogle = new Job("Analyst", 6, Google);
//        ArrayList<Job> googleJobs = new ArrayList<>();
//        googleJobs.add(SoftwareGoogle);
//        googleJobs.add(AccountantGoogle);
//        googleJobs.add(ManagerGoogle);
//        googleJobs.add(HRGoogle);
//        googleJobs.add(DesignerGoogle);
//        googleJobs.add(AnalystGoogle);
//        return googleJobs;
        Google.getJobs().add(SoftwareGoogle);
        Google.getJobs().add(AccountantGoogle);
        Google.getJobs().add(ManagerGoogle);
        Google.getJobs().add(HRGoogle);
        Google.getJobs().add(DesignerGoogle);
        Google.getJobs().add(AnalystGoogle);
    }
//    static public void setGoogleJobs(){
//        Google.setJobs(Controller.createGoogleJobs());
//    }

    // creating Microsoft jobs
    static public void createMicrosoftJobs(){
        Job SoftwareMicrosoft = new Job("Software Engineer", 7, Microsoft);
        Job AccountantMicrosoft = new Job("Accountant", 2, Microsoft);
        Job ManagerMicrosoft = new Job("Manager", 4, Microsoft);
        Job HRMicrosoft = new Job("HR", 2, Microsoft);
        Job DesignerMicrosoft = new Job("Designer", 4, Microsoft);
        Job AnalystMicrosoft = new Job("Analyst", 5, Microsoft);
//        ArrayList<Job> microsoftJobs = new ArrayList<>();
//        microsoftJobs.add(SoftwareMicrosoft);
//        microsoftJobs.add(AccountantMicrosoft);
//        microsoftJobs.add(ManagerMicrosoft);
//        microsoftJobs.add(HRMicrosoft);
//        microsoftJobs.add(DesignerMicrosoft);
//        microsoftJobs.add(AnalystMicrosoft);
//        return microsoftJobs;
        Microsoft.getJobs().add(SoftwareMicrosoft);
        Microsoft.getJobs().add(ManagerMicrosoft);
        Microsoft.getJobs().add(AccountantMicrosoft);
        Microsoft.getJobs().add(HRMicrosoft);
        Microsoft.getJobs().add(DesignerMicrosoft);
        Microsoft.getJobs().add(AnalystMicrosoft);

    }
//    static public void setMicrosoftJobs(){
//        Microsoft.setJobs(Controller.createMicrosoftJobs());
//    }

    // creating IBM jobs
    static public void createIBMJobs(){
        Job SoftwareIBM = new Job("Software Engineer", 6, IBM);
        Job AccountantIBM = new Job("Accountant", 3, IBM);
        Job ManagerIBM = new Job("Manager", 5, IBM);
        Job HRIBM = new Job("HR", 3, IBM);
        Job DesignerIBM = new Job("Designer", 7, IBM);
        Job AnalystIBM = new Job("Analyst", 6, IBM);
//        ArrayList<Job> IBMJobs = new ArrayList<>();
//        IBMJobs.add(SoftwareIBM);
//        IBMJobs.add(AccountantIBM);
//        IBMJobs.add(ManagerIBM);
//        IBMJobs.add(HRIBM);
//        IBMJobs.add(DesignerIBM);
//        IBMJobs.add(AnalystIBM);
//        return IBMJobs;
        IBM.getJobs().add(SoftwareIBM);
        IBM.getJobs().add(AccountantIBM);
        IBM.getJobs().add(ManagerIBM);
        IBM.getJobs().add(HRIBM);
        IBM.getJobs().add(DesignerIBM);
        IBM.getJobs().add(AnalystIBM);
    }
//    static public void setIBMJobs(){
//        IBM.setJobs(Controller.createIBMJobs());
//    }

    // creating Siemens jobs
    static public void createSiemensJobs(){
        Job SoftwareSiemens = new Job("Software Engineer", 4, Siemens);
        Job AccountantSiemens = new Job("Accountant", 2, Siemens);
        Job ManagerSiemens = new Job("Manager", 4, Siemens);
        Job HRSiemens = new Job("HR", 5, Siemens);
        Job DesignerSiemens = new Job("Designer", 2, Siemens);
        Job AnalystSiemens = new Job("Analyst", 6, Siemens);
//        ArrayList<Job> SiemensJobs = new ArrayList<>();
//        SiemensJobs.add(SoftwareSiemens);
//        SiemensJobs.add(AccountantSiemens);
//        SiemensJobs.add(ManagerSiemens);
//        SiemensJobs.add(HRSiemens);
//        SiemensJobs.add(DesignerSiemens);
//        SiemensJobs.add(AnalystSiemens);
        Siemens.getJobs().add(SoftwareSiemens);
        Siemens.getJobs().add(AccountantSiemens);
        Siemens.getJobs().add(ManagerSiemens);
        Siemens.getJobs().add(HRSiemens);
        Siemens.getJobs().add(DesignerSiemens);
        Siemens.getJobs().add(AnalystSiemens);
//        return SiemensJobs;
    }
//    static public void setSiemensJobs(){
//        Siemens.setJobs(Controller.createSiemensJobs());
//    }




    static Admin Habiba = new Admin("Habiba", "Habiba10", "123", 20, "habiba@gmail.com", IBM);
    static Job_Seeker Khaled = new Job_Seeker("khaled", "Khaled10", "1234", 20, "kmhtaha@gmail.com", 5, "Gamed mot");
    static Job_Poster Omar = new Job_Poster("Omar", "Omar10", "12345", 20, "omarsonny789@gmail.com", IBM);



    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> login(){
        ArrayList<String>inputs=new ArrayList<>();
        while(true) {
            if(num == 0){
                Controller.createGoogleJobs();
                Controller.createAmazonJobs();
                Controller.createIBMJobs();
                Controller.createMicrosoftJobs();
                Controller.createSiemensJobs();
                num++;
            }

            System.out.println("Please specify the type of user:\n"+"1.Admin\n"+"2.Job Poster\n"+"3.Job Seeker\n"+"4.Exit system\n");
            inputs.add(scanner.nextLine());
            if(!(inputs.get(0).equals("1")||inputs.get(0).equals("2")||inputs.get(0).equals("3") ||inputs.get(0).equals("4"))){
                System.out.println("Invalid type of user");
                System.out.println("-------------------------------------------------");
                inputs.clear();
                continue;
            }
            if(inputs.get(0).equals("4")){
                System.exit(0);
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
                inputs.clear();
                continue;
            }
            if(inputs.get(0).equals("2")){
                if (Job_Poster.validation(username, password)) {
                    System.out.println("Logged in!");
                    return inputs;
                }
                System.out.println("Invalid username or password , please try again.");
                System.out.println("-------------------------------------------------");
                inputs.clear();
                continue;
            }
            if(inputs.get(0).equals("3")){
                if (Job_Seeker.validation(username, password)) {
                    System.out.println("Logged in!");
                    return inputs;
                }

                System.out.println("Invalid username or password , please try again.");
                System.out.println("-------------------------------------------------");
                inputs.clear();
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
