package ru.sinitsyn.java.basic.homeworks.homework4;

public class MainBox {
    public MainBox() {
    }

    public static void main(String[] args) {
        Box box1 = new Box(50, 50, 50, "Серый");
        box1.info();
        box1.setColor("Синий");
        box1.clickOpen();
        box1.putItem("пирожок");
        box1.clickClose();
        box1.putItem("морковка");
        box1.info();
    }
}
