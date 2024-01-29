package ru.sinitsyn.java.Basic.homeworks.homework2;

import java.util.Arrays;

import java.util.Scanner;

public class Lesson2Arrays {

    public static void main(String[] args) {

        task1UsageFor("метод, принимающий в качестве Аргументов целое число и строку, и печатающий в консоль строку указанное количество раз");

        task2ArraySumElementsMoreThen5();

        task3ArrayWithEqualNumbers();

        task4ArrayWithIncreasingNumbers();

        task5SummOfBiggerHalfArray();
    }

    public static void task1UsageFor(String a) {
        for (int i = 0; i < 5; i++) {
            System.out.println(a);
        }
    }
    public static void task2ArraySumElementsMoreThen5() {
        int[] arr = {1, 3, 8, 9, 4, 6, 7, 2, 5, 0};
        int sumNumbersMoreThen5 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5) {
                sumNumbersMoreThen5 += arr[i];
            }
        }
        System.out.println(sumNumbersMoreThen5);
    }

    public static void task3ArrayWithEqualNumbers() {
        int[] arr = new int[100];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число, которым будет заполнен массив");
        int numberForFillingArray = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = numberForFillingArray;
        }
        System.out.println(Arrays.toString(arr));

    }

    public static void task4ArrayWithIncreasingNumbers() {
        int[] arr = new int[50];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число, которым будет заполнен первый элемент массива");
        int numberForFillingArray = scanner.nextInt();
        arr[0] = numberForFillingArray;
        System.out.println("Введите целое число, на которое будет увеличиваться каждый последующий элемент массива");
        int increaseEachNextElementOfArrayTo = scanner.nextInt();
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + increaseEachNextElementOfArrayTo;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void task5SummOfBiggerHalfArray() {
        int[] arr = new int[50];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 21);
        }
        System.out.println(Arrays.toString(arr));
        int summFirstHalfArray = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            summFirstHalfArray += arr[i];
        }
        System.out.println(summFirstHalfArray);
        int summSecondHalfArray = 0;
        for (int i = arr.length / 2; i < arr.length; i++) {
            summSecondHalfArray += arr[i];
        }
        System.out.println(summSecondHalfArray);
        if (summFirstHalfArray > summSecondHalfArray) {
            System.out.println(summFirstHalfArray);
        } else {
            System.out.println(summSecondHalfArray);
        }
    }
}