package ru.sinitsyn.java.basic.homeworks.homework1;
// Добавление консольного запроса информации
import java.util.Scanner;


public class lesson1 {
    public static void main(String[] args) {
        //Вывод для задания 1
        greetings();

        //вывод для задания 2
        checkSign();

        //вывод для задания 3
        selectColor(10);

        //вывод для задания 4
        compareNumbers(3, 7);

        //вывод для задания 5
        addOrSubtractAndPrint(7, 6, false);

        //вывод для задания 6 *
        extraComplexityTask();

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
    public static void selectColor(int data) {
        if (data <= 10) {
            System.out.println("Красный");
        }
        if (data > 10 && data <= 20) {
            System.out.println("Желтый");
        }
        if (data > 20) {
            System.out.println("Зеленый");
        }


    }

    //Решение задачи №4
    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }

    //Решение задачи № 5
    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment == true) {
            System.out.println(initValue + delta);
        } else if (increment == false) {
            System.out.println(delta - initValue);
        }
    }

    //Решение задачи № 6 *

    public static void extraComplexityTask() {
        int randomNumber = (int) (Math.random() * 5);
        System.out.println(randomNumber);
        if (randomNumber == 1) {
            greetings();
        } else if (randomNumber == 2) {
            checkSign();
        } else if (randomNumber == 3) {
            selectColor(10);
        } else if (randomNumber == 4) {
            compareNumbers(5, 9);
        } else if (randomNumber == 5) {
            addOrSubtractAndPrint(4, 5, true);
        }
    }
}

