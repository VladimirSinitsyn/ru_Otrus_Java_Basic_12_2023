package ru.sinitsyn.java.basic.homeworks.homework8;

public class Main {
    public static void main(String[] args) {
        String[][] array = {

                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}

        };

        try {
            int sum = sumArray(array);
            System.out.println("Сумма элементов массива: " + sum);
        } catch (AppArraySizeException ex) {
            System.err.println("Массив имеет некорректный размер: " + ex.getMessage());
        } catch (AppArrayDataException ex) {
            System.err.println("Неверные данные в ячейке: " + ex.getMessage());
        }
    }

    public static int sumArray(String[][] array) throws AppArraySizeException, AppArrayDataException {
        if (array.length != 4) {
            throw new AppArraySizeException("Массив должен быть 4x4");
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException ex) {
                    throw new AppArrayDataException("[" + i + "][" + j + "]");
                }
            }
        }
        return sum;
    }

    private static class AppArraySizeException extends Exception {
        public AppArraySizeException(String message) {
            super(message);
        }
    }

    private static class AppArrayDataException extends Exception {
        public AppArrayDataException(String message) {
            super(message);
        }
    }
}
