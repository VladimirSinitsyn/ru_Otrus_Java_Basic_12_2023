package ru.sinitsyn.java.basic.homeworks.homework9;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        minMax();
        sumElementsIfValuesMoreThen5();
        rewriteElementsByIntNumber(100, new ArrayList<>(List.of(10, 9, 2, 8, 3, 7, 4, 6, 5)));

    }


    /*Реализуйте метод, принимающий в качестве аргументов числа min и max,
    и возвращающий ArrayList с набором последовательных значений в указанном диапазоне (min и max включительно, шаг - 1)*/
    public static void minMax() {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(10, 9, 2, 8, 3, 7, 4, 6, 5));
        int min = arrayList.get(0);
        int max = arrayList.get(0);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) < min) {
                min = arrayList.get(i);
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) > max) {
                max = arrayList.get(i);
            }
        }
        arrayList.sort(Comparator.naturalOrder());
        System.out.println("Значение min = " + min);
        System.out.println("Значение max = " + max);
        System.out.println("Отсотрированный массив со значениями от min до max: " + arrayList);
    }

    /* Реализуйте метод, принимающий в качестве аргумента список целых чисел,
    суммирующий все элементы, значение которых больше 5, и возвращающий сумму;*/
    public static void sumElementsIfValuesMoreThen5() {
        int sum = 0;
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(10, 9, 2, 8, 3, 7, 4, 6, 5));
        for (Integer value : arrayList) {
            if (value > 5) {
                sum += value;
            }
        }
        System.out.println("Сумма элементов массива, значения которых больше 5 = " + sum);

    }


    /*Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на список,
    метод должен переписать каждую заполненную ячейку списка указанным числом;*/
    public static void rewriteElementsByIntNumber(int number, List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)!=null){
                list.set(i,number);
            }
        }
        System.out.println(list);

    }

}





