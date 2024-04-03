package ru.sinitsyn.java.basic.homeworks.homework12;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class TextFiles {
    public static void main(String[] args) {
        System.out.println("Список файлов в корневом каталоге: " + displayTextFilesInRoot());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя файла, с которым хотите работать");
        String filename = scanner.nextLine();
        File file = new File(filename);
        if (!file.exists()) {
            System.out.println("Файл не нейден");
            return;
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Не удалость прочитать файл " + e.getMessage());
        }
        System.out.println("Введите данные для записи в файл");
        String inputStream = scanner.nextLine();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.write(inputStream);
            writer.newLine();
            System.out.println("Строка успешно записана");
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл " + e.getMessage());
        }
    }

    public static ArrayList<String> displayTextFilesInRoot() {
        File folder = new File("./");
        File[] listFiles = folder.listFiles();
        ArrayList<String> fileNames = new ArrayList<>();
        for (File file : listFiles) {
            if (file.isFile() && file.getName().endsWith(".txt")) {
                fileNames.add(file.getName());
            }
        }
        return fileNames;
    }
}





