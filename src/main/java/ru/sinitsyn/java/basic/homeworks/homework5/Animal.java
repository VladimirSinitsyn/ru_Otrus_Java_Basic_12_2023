package ru.sinitsyn.java.basic.homeworks.homework5;

/*Создайте классы Cat, Dog и Horse с наследованием от класса Animal
        У каждого животного есть имя, скорость бега и плавания (м/с), и выносливость (измеряется в условных единицах)
        Затраты выносливости:
        Все животные на 1 метр бега тратят 1 ед выносливости,
        Собаки на 1 метр плавания - 2 ед.
        Лошади на 1 метр плавания тратят 4 единицы
        Кот плавать не умеет.
        Реализуйте методы run(int distance) и swim(int distance), которые должны возвращать время, затраченное на указанное действие,
        и “понижать выносливость” животного.
        Если выносливости не хватает, то возвращаем время -1 и указываем что у животного появилось состояние усталости.
        При выполнении действий пишем сообщения в консоль.
        Добавляем метод info(), который выводит в консоль состояние животного.*/
public abstract class Animal {
    public String name;
    private int swimmingSpeed;
    private int endurance = 100;
    private int runTime;
    private int swimTime;

    public String getName() {
        return name;
    }

    public int getEndurance() {
        return endurance;
    }

    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public int getRunTime() {
        return runTime;
    }

    public void setRunTime(int runTime) {
        this.runTime = runTime;
    }

    public int getSwimTime() {
        return swimTime;
    }

    public void setSwimTime(int swimTime) {
        this.swimTime = swimTime;
    }

    public Animal(String name) {
        this.name = name;
    }

    public void run(int distance, int runSpeed) {
        setEndurance(getEndurance() - distance);
        if (endurance < 0) {
            System.out.println("У " + name + " состояние усталости");
            setRunTime(-1);
            setEndurance(0);
        } else setRunTime(distance / runSpeed);
    }

    public abstract void swim(int distance);

    public void info() {
        System.out.println(name + " бежал: " + runTime + " cек");
        System.out.println(name + " плыл: " + swimTime + " cек");
        System.out.println("У " + name + " осталось: " + endurance + " выносливости");
    }
}
