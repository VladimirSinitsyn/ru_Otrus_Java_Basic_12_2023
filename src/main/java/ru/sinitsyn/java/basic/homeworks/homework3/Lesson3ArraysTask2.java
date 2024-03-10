package ru.sinitsyn.java.basic.homeworks.homework3;
/*Реализовать метод, который принимает в качестве аргумента int size и печатает
в консоль квадрат из символов * со сторонами соответствующей длины;*/

public class Lesson3ArraysTask2 {

    public static void main(String[] args) {
        printSquare(5);
    }

    public static void printSquare(int size) {
        char def = '*';
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(def);

            }
            System.out.println();
        }
    }
}
