package ru.sinitsyn.java.basic.homeworks.homework3;

//Реализовать метод findMax(int[][] array) который должен найти и вернуть максимальный элемент массива;
public class Lesson3ArraysTask4 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 40, 3},
                {4, 15, 6},
                {7, 25, 9}
        };
        findMax(array);
    }

    public static void findMax(int[][] array) {
        int maxElement = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] > maxElement) {
                    maxElement = array[i][j];
                }
            }
        }
        System.out.println(maxElement);
    }
}

