package ru.sinitsyn.java.basic.homeworks.homework3;

/*Реализуйте метод, который считает сумму элементов второй строки двумерного массива,
если второй строки не существует, то в качестве результата необходимо вернуть -1*/
public class lesson3ArraysTask5 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {7, 9, 9},
                {7, 10, 9}
        };
        sumOfElementsSecondRow(array);
    }

    public static void sumOfElementsSecondRow(int[][] array) {
        int sum = 0;
        int countI = 0;

        for (int i = 0; i < array[i].length; i++) {
            sum += array[2][i];
            for (int j = 0; j < array.length; j++) {
                countI = array.length;
            }
        }
        if (countI < 3) {
            System.out.println("-1");
        }
        System.out.println(sum);
        System.out.println(countI);


    }
}
