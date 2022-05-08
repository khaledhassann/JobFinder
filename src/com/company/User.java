package com.company;

import java.util.ArrayList;

public class User {
    private String name;
    private String username;
    private String password;
    private int age;
    private String email;
    static ArrayList<String> Username=new ArrayList<String>();
    static ArrayList<String> Password=new ArrayList<String>();


    public User(String name, String username, String password, int age, String email) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.age = age;
        this.email = email;
        Username.add(username);
        Password.add(password);

    }

    public User(String name) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean validation(String username,String password){
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

