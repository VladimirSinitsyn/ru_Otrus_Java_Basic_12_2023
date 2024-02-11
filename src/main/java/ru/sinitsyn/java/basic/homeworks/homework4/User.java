package ru.sinitsyn.java.basic.homeworks.homework4;

public class User {
    private String firstName;
    private String lastName;
    private String fatherName;
    private int birthdayYear;
    private String eMail;
    private int age;

    public int getBirthdayYear() {
        return this.birthdayYear;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getFatherName() {
        return this.fatherName;
    }

    public String getEMail() {
        return this.eMail;
    }

    public int getAge() {
        return this.age;
    }

    public User(String firstName, String lastName, String fatherName, int birthdayYear, String eMail) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.birthdayYear = birthdayYear;
        this.eMail = eMail;
    }

    public void info() {
        System.out.println("ФИО: " + this.lastName + " " + this.firstName + " " + this.fatherName);
        System.out.println("Год рождения: " + this.birthdayYear);
        System.out.println("E-Mail " + this.eMail);
    }

    public int userAge() {
        this.age = 2024 - this.birthdayYear;
        return this.getAge();
    }
}
