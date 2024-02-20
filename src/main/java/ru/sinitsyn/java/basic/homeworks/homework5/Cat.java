package ru.sinitsyn.java.basic.homeworks.homework5;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кошка не умеет плавать");
    }
}
