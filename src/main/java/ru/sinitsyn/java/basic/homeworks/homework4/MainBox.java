package ru.sinitsyn.java.basic.homeworks.homework4;

public class MainBox {
    public MainBox() {
    }

    public static void main(String[] args) {
        Box box1 = new Box(50, 50, 50, "Серый");
        box1.info1();
        box1.setBoxColor("Синий");
        box1.clickOpen();
        box1.putItem("морковка");
        box1.info1();





    }
}
