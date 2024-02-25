package ru.sinitsyn.java.basic.homeworks.homework6;

public class Cat {
    private String name;
    private Boolean feelingFull;

    public Cat(String name) {
        this.name = name;
        this.feelingFull = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(Plate plate) {
        if (!feelingFull && plate.getCurrentFoodValue() > 0) {
            plate.decreaseFood(20);
            feelingFull = true;
            System.out.println("Кот " + name + " наелся");
        } else {
            System.out.println("Кот " + name + " Голоден");
        }
    }

    public void info() {
        System.out.println("Статус сытости " + feelingFull);
    }
}
