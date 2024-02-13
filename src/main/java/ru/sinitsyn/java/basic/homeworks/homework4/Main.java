
package ru.sinitsyn.java.basic.homeworks.homework4;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        User[] users= {
                new User("Ivan", "Ivanov","Ivanovich",1980, "ivanov@ivanov.ru"),
                new User("Sergey", "Sergeev", "Sergeevich", 1960, "sergeev@mail.ru"),
                new User("Vladimir", "Vladimirov", "Vladimirovich", 1965, "vladimirov@mail.ru"),
                new User("Dmitry", "Dmitriev", "Dmitrievich", 1970, "dmitriev@mail.ru"),
                new User("Oleg", "Olegov", "Olegovich", 1975, "olegov@mail.ru"),
                new User("Alexandr", "Alexandrov", "Alexandrovich", 1990, "alexandrov@mail.ru"),
                new User("Michail", "Mikhailov", "Mikhailovich", 1985, "mikhailov@mail.ru"),
                new User("Andrew", "Andreew", "Andreewich", 1995, "andreev@mail.ru"),
                new User("Olga", "Sergeeva", "Sergeevna", 2000, "sergeeva@mail.ru"),
                new User("Maria", "Vladimirova", "Vladimirovna", 2005, "vladimirova@mail.ru")
        };

        for(int i = 0; i < users.length; ++i) {
            if (users[i].userAge() > 40) {
                users[i].info();
            }
        }

    }
}
