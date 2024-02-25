package ru.sinitsyn.java.basic.homeworks.homework6;

public class Cat {
    private String name;
    private int appetite;
    private boolean feelingFull=false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite=appetite;
        /*this.feelingFull = false;*/

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        if (!feelingFull && plate.getCurrentFoodValue() > 0 && appetite< plate.getCurrentFoodValue()) {
           plate.decreaseFood(appetite);
            System.out.println("Кот " + name + " наелся");
            feelingFull = true;



            } else {
                System.out.println("Кот " + name + " Голоден");
            }
        }


    public void info() {
        System.out.println("Статус сытости " + feelingFull);
    }
}
