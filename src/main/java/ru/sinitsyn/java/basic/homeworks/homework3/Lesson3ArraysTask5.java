package ru.sinitsyn.java.basic.homeworks.homework3;

/*Реализуйте метод, который считает сумму элементов второй строки двумерного массива,
если второй строки не существует, то в качестве результата необходимо вернуть -1*/
public class Lesson3ArraysTask5 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {7, 9, 9},
                {7, 10, 9}
        };
        System.out.println(sumOfElementsSecondRow(array));

    }

    public static int sumOfElementsSecondRow(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array[i].length; i++) {
            if (array.length < 2) {
                System.out.println("-1");
            } else {
                sum += array[1][i];
            }
        }
        System.out.println(array.length);
        return sum;
    }
}