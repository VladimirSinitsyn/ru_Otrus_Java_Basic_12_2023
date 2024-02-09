package ru.sinitsyn.java.basic.homeworks.homework3;

public class lesson3ArraysTask2 {

    public static void main(String[] args) {
        printarr(5);
    }
    public static void printarr(int size) {
        char def = '*';
        char[][] arr1 = new char[size][size];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                arr1[i][j] = def;
                System.out.print(arr1[i][j]);
            }
            System.out.println();
        }
    }
}
