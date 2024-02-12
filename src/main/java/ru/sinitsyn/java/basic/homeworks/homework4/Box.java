package ru.sinitsyn.java.basic.homeworks.homework4;
/*Попробуйте реализовать класс по его описания: объекты класса Коробка должны иметь размеры и цвет.
Коробку можно открывать и закрывать. Коробку можно перекрашивать. Изменить размер коробки после создания нельзя.
У коробки должен быть метод, печатающий информацию о ней в консоль. В коробку можно складывать предмет (если в ней нет предмета),
или выкидывать его оттуда (только если предмет в ней есть), только при условии что коробка открыта (предметом читаем просто строку).
Выполнение методов должно сопровождаться выводом сообщений в консоль.
 */

public class Box {
    private int boxSizeHeight;
    private int boxSizeWeight;
    private int boxSizeDepth;
    private String boxColor;
    private Boolean isStatusOpened;
    private String item;


    public int getBoxSizeHeight() {
        return boxSizeHeight;
    }

    public int getBoxSizeWeight() {
        return boxSizeWeight;
    }

    public int getBoxSizeDepth() {
        return boxSizeDepth;
    }


    public Boolean getIsStatusOpened() {
        return isStatusOpened;

    }

    public String getItem() {
        return item;
    }

    public void setBoxColor(String boxColor) {
        this.boxColor = boxColor;
    }

    public Box(int boxSizeHeight, int boxSizeWeight, int boxSizeDepth, String boxColor) {
        this.boxSizeHeight = boxSizeHeight;
        this.boxSizeWeight = boxSizeWeight;
        this.boxSizeDepth = boxSizeDepth;
        this.boxColor = boxColor;
        this.isStatusOpened = false;
        this.item = null;

    }

    public void clickOpen() {
        isStatusOpened = true;
        System.out.println("Коробка открыта");
    }


    public void clickClose() {
        isStatusOpened = false;
        System.out.println("Коробка закрыта");
    }

    public void info1() {
        System.out.println("Коробка c размерами: \nДлина: " + boxSizeHeight + "\nШирина: " + boxSizeWeight + "\nВысота: " + boxSizeDepth + "\nЦвет: " + boxColor);
        System.out.println(isStatusOpened ? "Коробка открыта" : "Коробка закрыта");
        if (item == null) {
            System.out.println("Коробка пустая");
        } else System.out.println("В коробке находится " + item);
    }


    public void putItem(String item) {
        if (this.item == null && isStatusOpened==true) {
            this.item = item;
            System.out.println("В коробке находится " + item);


        }
    }

    public void throwItem() {
        if (item != null && isStatusOpened == true) {
            item = null;
        }
    }
}


