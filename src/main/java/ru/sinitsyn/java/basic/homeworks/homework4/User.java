package ru.sinitsyn.java.basic.homeworks.homework4;

public class User {
    private String firstName;
    private String lastName;
    private String fatherName;
    private int birthdayYear;
    private String eMail;
    private int age;

    public int getBirthdayYear() {
        return birthdayYear;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getEMail() {
        return eMail;
    }

    public int getAge() {
        return age;
    }

    public User(String firstName, String lastName, String fatherName, int birthdayYear, String eMail) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.birthdayYear = birthdayYear;
        this.eMail = eMail;
    }

    public void info() {
        System.out.println("ФИО: " + lastName + " " + firstName + " " + fatherName);
        System.out.println("Год рождения: " + birthdayYear);
        System.out.println("E-Mail " + eMail);
    }

    public int userAge() {
        age = 2024 - birthdayYear;
        return getAge();
    }
}
