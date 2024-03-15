package ru.sinitsyn.java.basic.homeworks.homework9;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = minMaxList(-3, 5);
        System.out.println("Значения элементов от min до max: " + numberList);
        System.out.println("Сумма элементов массива, значения которых больше 5 = " + sumElementsIfValuesMoreThen5(List.of(3, 5, 4, 7, 5, 6, 8, 9, 7, 10)));
        rewriteElementsByIntNumber(100, new ArrayList<>(List.of(10, 9, 2, 8, 3, 7, 4, 6, 5)));

    }


    /**
     * Реализуйте метод, принимающий в качестве аргументов числа min и max,
    и возвращающий
     * @return  ArrayList </Integer> с набором последовательных значений в указанном диапазоне (min и max включительно, шаг - 1)
   */
    public static ArrayList<Integer> minMaxList(int min, int max) {
        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            numberList.add(i);
        }
        return numberList;
    }


    /**
     *  Реализуйте метод, принимающий в качестве аргумента список целых чисел,
    суммирующий все элементы, значение которых больше 5, и возвращающий сумму;*/
    public static int sumElementsIfValuesMoreThen5(List<Integer> numbers) {
        int sum = 0;
        for (Integer value : numbers) {
            if (value > 5) {
                sum += value;
            }
        }
        return sum;
    }


    /**
     * Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на список,
    метод должен переписать каждую заполненную ячейку списка указанным числом;*/
    public static void rewriteElementsByIntNumber(int number, List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null) {
                list.set(i, number);
            }
        }
        System.out.println(list);
    }
}





