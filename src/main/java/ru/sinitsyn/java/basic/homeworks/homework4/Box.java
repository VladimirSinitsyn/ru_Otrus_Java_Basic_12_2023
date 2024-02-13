package ru.sinitsyn.java.basic.homeworks.homework4;
/*Попробуйте реализовать класс по его описания: объекты класса Коробка должны иметь размеры и цвет.
Коробку можно открывать и закрывать. Коробку можно перекрашивать. Изменить размер коробки после создания нельзя.
У коробки должен быть метод, печатающий информацию о ней в консоль. В коробку можно складывать предмет (если в ней нет предмета),
или выкидывать его оттуда (только если предмет в ней есть), только при условии что коробка открыта (предметом читаем просто строку).
Выполнение методов должно сопровождаться выводом сообщений в консоль.
 */

public class Box {
    private int SizeHeight;
    private int SizeWeight;
    private int SizeDepth;
    private String Color;
    private Boolean isStatusOpened;
    private String item;


    public int getSizeHeight() {
        return SizeHeight;
    }

    public int getSizeWeight() {
        return SizeWeight;
    }

    public int getSizeDepth() {
        return SizeDepth;
    }


    public Boolean getIsStatusOpened() {
        return isStatusOpened;

    }

    public String getItem() {
        return item;
    }

    public void setColor(String boxColor) {
        this.Color = Color;
    }

    public Box(int SizeHeight, int SizeWeight, int SizeDepth, String Color) {
        this.SizeHeight = SizeHeight;
        this.SizeWeight = SizeWeight;
        this.SizeDepth = SizeDepth;
        this.Color = Color;
        this.isStatusOpened = false;
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
        System.out.println("Коробка c размерами: \nДлина: " + SizeHeight + "\nШирина: " + SizeWeight + "\nВысота: " + SizeDepth + "\nЦвет: " + Color);
        System.out.println(isStatusOpened ? "Коробка открыта" : "Коробка закрыта");
        if (item == null) {
            System.out.println("Коробка пустая");
        } else {
            System.out.println("В коробке находится " + item);
        }
    }


    public void putItem(String item) {
        if (this.item == null && isStatusOpened == true) {
            this.item = item;
            System.out.println("В коробке находится " + item);
        } else System.out.println("Коробка закрыта. Не удалось положить " + item + " в коробку");
    }

    public void throwItem() {
        if (item != null && isStatusOpened == true) {
            item = null;
        }
    }
}


