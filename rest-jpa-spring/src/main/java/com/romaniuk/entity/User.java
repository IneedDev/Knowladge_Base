package com.romaniuk.entity;

public class User {

    private String firstname;
    private String lastname;
    private int age;
    private boolean employed;

    public User() {
    }

    public User(String firstname, String lastname, int age, boolean employed) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.employed = employed;
    }

    public boolean isEmployed() {
        return employed;
    }

    public void setEmployed(boolean employed) {
        this.employed = employed;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
