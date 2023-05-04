package Homework.Lesson_3.HW_Exercise_3;

import java.util.List;

/* Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
Найти названия книг, в которых простое количество страниц, фамилия автора содержит «А» и год издания после 2010 г, включительно. */

public class Books {

    public String bookTitle;
    public String surname;
    public double price;
    public int yearPublishing;
    public int pages;

    public Books(String bookTitle, String surname, double price, int yearPublishing, int pages, List<Integer> asList) {
        this.bookTitle = bookTitle;
        this.surname = surname;
        this.price = price;
        this.yearPublishing = yearPublishing;
        this.pages = pages;
    }
}