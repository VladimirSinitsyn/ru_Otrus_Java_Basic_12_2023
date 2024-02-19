package ru.sinitsyn.java.basic.homeworks.homework5;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);

    }

    @Override
    public void swim(int distance) {
        setSwimmingSpeed(5);
        setEndurance(getEndurance() - distance * 2);
        if (getEndurance() < 0) {
            System.out.println("У " + name + " состояние усталости");
            setSwimTime(-1);
            setEndurance(0);
        } else setSwimTime(distance / getSwimmingSpeed());
    }


}