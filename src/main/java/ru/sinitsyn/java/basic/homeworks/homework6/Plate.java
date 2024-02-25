package ru.sinitsyn.java.basic.homeworks.homework6;

public class Plate {
    private int food;
    private int plateCapacity;
    private int currentFoodValue;
    private boolean foodStatus;

    public Plate(int plateCapacity) {
        this.plateCapacity = plateCapacity;
        addFoodToPlate(plateCapacity);
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int getPlateCapacity() {
        return plateCapacity;
    }

    public void setPlateCapacity(int plateCapacity) {
        this.plateCapacity = plateCapacity;
    }

    public int getCurrentFoodValue() {
        return currentFoodValue;
    }

    public void setCurrentFoodValue(int currentFoodValue) {
        this.currentFoodValue = currentFoodValue;
    }

    public void addFoodToPlate(int food) {
        if (food + currentFoodValue > plateCapacity) {
            currentFoodValue = plateCapacity;
        } else currentFoodValue += food;
    }

    public void decreaseFood(int food) {
        if (currentFoodValue <= 0) {
            System.out.println("еда закончилась");
        } else {
            currentFoodValue -= food;
        }
    }

    public boolean booleanFoodStatus() {
        if (currentFoodValue >= 0) {
            return foodStatus = true;
        } else {
            return false;
        }
    }

    public void info() {
        System.out.println("Количество еды в миске: " + currentFoodValue + " \n Статус наличия еды: " + booleanFoodStatus());
    }
}
