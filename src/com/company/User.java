package com.company;

import java.util.ArrayList;

public class User {
    private String name;
    private String username;
    private String password;
    private int age;
    private String email;
    private ArrayList<String> Username=new ArrayList<String>();
    private ArrayList<String> Password=new ArrayList<String>();


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

    public void validation(String username,String password){
    for( String i:Username ){
        if(i.equals(username)){
            System.out.println("Logged in!");
        }else{
            System.out.println("Invalid");
        }
    }
    }
    public void options(){

//uiglhj

    }

}

