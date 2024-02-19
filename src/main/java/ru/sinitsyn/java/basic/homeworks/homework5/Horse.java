package ru.sinitsyn.java.basic.homeworks.homework5;

public class Horse extends Animal {
    public Horse(String name) {
        super(name);
    }

    @Override
    public void swim(int distance) {
        setSwimmingSpeed(10);
        setEndurance(getEndurance() - distance * 4);
        if (getEndurance() < 0) {
            System.out.println("У " + name + " состояние усталости");
            setEndurance(0);
            setSwimTime(-1);
        } else setSwimTime(distance / getSwimmingSpeed());
    }
}