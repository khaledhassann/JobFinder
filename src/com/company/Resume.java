package com.company;

public class Resume {
    private String name;
    private String email;
    private int age;
    private int experience;
    private String skills;

    public Resume(String name, String email, int age, int experience, String skills) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.experience = experience;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }
    public String toString(){
        return name+"\n"+email+"\n"+age+"\n"+experience+"\n"+skills;
    }
}
