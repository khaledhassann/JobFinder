package com.company;

import java.util.ArrayList;

public class Admin extends User {
    private Company company;
    static ArrayList<String> Username = new ArrayList<String>();
    static ArrayList<String> Password = new ArrayList<String>();

    public Admin(String name, String username, String password, int age, String email, Company company) {
        super(name, username, password, age, email);
        this.company = company;
    }

    public Admin(String name, Company company) {
        super(name);
        this.company = company;
    }

    /*public Admin(Company company) {

        this.company = company;
    }*/

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
    public void Addposter(){

    }
    public void ChangeInfo(){

    }

}
