package ru.sinitsyn.java.basic.homeworks.homework3;

//Реализовать метод, принимающий в качестве аргумента двумерный целочисленный массив,
// и зануляющий его диагональные элементы (можете выбрать любую из диагоналей, или занулить обе)
public class lesson3ArraysTask3 {
    public static void main(String[] args) {
        int arr1[][] = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        diagonalsSetNull(arr1);
    }

    public static void diagonalsSetNull(int[][] arr1) {


        int nulldiagonal = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                arr1[i][arr1[i].length - i - 1] = nulldiagonal;
                if (i == j) {
                    arr1[i][j] = nulldiagonal;
                }

                System.out.print(arr1[i][j] + "     ");
            }
            System.out.println('\n');
        }
    }
}