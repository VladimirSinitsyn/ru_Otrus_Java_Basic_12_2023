
package ru.sinitsyn.java.basic.homeworks.homework9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
* Создайте класс Сотрудник с полями: имя, возраст;
* Реализуйте метод, принимающий в качестве аргумента список сотрудников, и возвращающий список их имен;
* Реализуйте метод, принимающий в качестве аргумента список сотрудников и минимальный возраст,
  и возвращающий список сотрудников, возраст которых больше либо равен указанному аргументу;
* Реализуйте метод, принимающий в качестве аргумента список сотрудников и минимальный средний возраст,
  и проверяющий что средний возраст сотрудников превышает указанный аргумент;
* Реализуйте метод, принимающий в качестве аргумента список сотрудников, и возвращающий ссылку на самого молодого сотрудника*/
public class Employee {
    //Ниже модуль для запуска методов
    public static void main(String[] args) {
        List<Employee> employee = generateList();
        //вывод задач в консоль по порядку
        System.out.println("Cписок имен сотрудников: " + returnListOfNames(employee));
        System.out.println("Список сотрудников, возраст которых больше либо равен указанному аргументу(в данном случае 35):  " + returnEmployeeListByMinAge(employee, 35));
        System.out.println("Проверка, что средний возраст всех сотрдуников больше 29 " + checkMinAverageAge(employee, 29));
        System.out.println("Самый молодой сотрудник " + Employee.returnLinkToYoungestEmployee(employee));
    }
    //Ниже конструктор
    private String firstName;
    private String lastName;
    private int age;
    public Employee(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + age;
    }
    //Утильный метод для работы со списками сотрудников
    public static List<Employee> generateList() {
        List<Employee> result = new ArrayList<>();
        result.add(new Employee("Иван", "Иванов", 30));
        result.add(new Employee("Cергей", "Сергеев", 25));
        result.add(new Employee("Пётр", "Петров", 35));
        result.add(new Employee("Елена", "Еленовна", 20));
        result.add(new Employee("Максим", "Максимов", 40));
        return result;

    }
    //Ниже методы по порядку

    //Реализуйте метод, принимающий в качестве аргумента список сотрудников, и возвращающий список их имен;
    public static List<String> returnListOfNames(List<Employee> employees) {
        List<String> firstNames = new ArrayList<>();
        for (Employee employee : employees) {
            firstNames.add(employee.getFirstName());
        }
        return firstNames;
    }

    /*Реализуйте метод, принимающий в качестве аргумента список сотрудников и минимальный возраст,
    и возвращающий список сотрудников, возраст которых больше либо равен указанному аргументу;*/
    public static List<Employee> returnEmployeeListByMinAge(List<Employee> employees, int minAge) {
        List<Employee> employeeListByMinAge = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getAge() >= minAge) {
                employeeListByMinAge.add(employee);
            }
        }
        return employeeListByMinAge;
    }

    /*    Реализуйте метод, принимающий в качестве аргумента список сотрудников и минимальный средний возраст,
        и проверяющий что средний возраст сотрудников превышает указанный аргумент;*/
    public static boolean checkMinAverageAge(List<Employee> employees, int minAverageAge) {
        int sumOfAges = 0;
        for (Employee employee : employees) {
            sumOfAges += employee.getAge();
        }
        int averageAge = sumOfAges / employees.size();
        return averageAge > minAverageAge;
    }

    /*    Реализуйте метод, принимающий в качестве аргумента список сотрудников, и возвращающий ссылку на самого молодого сотрудника.*/
    public static Employee returnLinkToYoungestEmployee(List<Employee> employees) {
        Collections.sort(employees, (employee1, employee2) -> Integer.compare(employee1.getAge(), employee2.getAge()));
        return employees.get(0);
    }
}
