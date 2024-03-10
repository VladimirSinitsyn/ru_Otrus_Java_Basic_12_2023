package ru.sinitsyn.java.basic.homeworks.homework3;

public class Lesson3ArraysTask1 {

    public static void main(String[] args) {
        /*Реализовать метод sumOfPositiveElements(..),
        принимающий в качестве аргумента целочисленный двумерный массив,
        метод должен посчитать и вернуть сумму всех элементов массива, которые больше 0;*/

        int[][] arr1 = {{1, -2, 3}, {4, -5, 6}, {7, 8, 9}};
        System.out.println(sumOfPositiveElements(arr1));
    }

    public static int sumOfPositiveElements(int[][] arr1) {
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[i][j] > 0) {
                    sum += arr1[i][j];
                }
            }
        }
        return sum;
    }
 }
