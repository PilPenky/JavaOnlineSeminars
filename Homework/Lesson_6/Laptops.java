package Homework.Lesson_6;

import java.util.List;

/* 
• Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
• Создать множество ноутбуков.
• Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map.
Например:
“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
• Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
• Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
*/

public class Laptops {

    public String brand;
    public double price;
    public String color;
    public double screen_Diagonal;
    public int ram;
    public int hd_capacity;
    public String os;

    public Laptops(String brand, double price, String color, double screen_Diagonal, int ram, int hd_capacity, String os, List<Integer> asList) {
        this.brand = brand;
        this.price = price;
        this.color = color;
        this.screen_Diagonal = screen_Diagonal;
        this.ram = ram;
        this.hd_capacity = hd_capacity;
        this.os = os;
    }
}