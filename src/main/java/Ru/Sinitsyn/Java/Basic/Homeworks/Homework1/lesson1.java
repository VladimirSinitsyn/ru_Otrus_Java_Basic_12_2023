package Ru.Sinitsyn.Java.Basic.Homeworks.Homework1;

import java.util.Scanner;


public class lesson1 {
    public static void main(String[] args) {
        //Вывод для задания 1
        greetings();
        //вывод для задания 2
        checkSign();
        //вывод для задания 3
        selectColor();


    }

    //Решение задачи №1
    public static void greetings() {
        System.out.println("Hello\nWorld\nfrom\nJava");

    }

    //Решение задачи №2
    public static void checkSign() {
        System.out.println("Введите первое число");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        System.out.println("Введите третье число");
        int c = scanner.nextInt();
        int result = a + b + c;
        if (result > 0)
            System.out.println("Сумма положительная");
        else
            System.out.println("Сумма отрицательная");


    }

    //Решение задачи №3
    public static void selectColor(String[] args) {

    }
}
