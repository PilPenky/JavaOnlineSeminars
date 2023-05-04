package Homework.Lesson_3.HW_Exercise_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
Найти названия книг, в которых простое количество страниц, фамилия автора содержит «А» и год издания после 2010 г, включительно. */

public class Main {
    public static void main(String[] args) {
        List<Books> book = GetBook();
        List<String> resultBookTitles = new ArrayList<>();
        
        for (Books books : book) {
            if(books.yearPublishing > 2010){
                String[] str = books.surname.split("");
                for (int i = 0; i < str.length; i++) {
                    if(str[i].toLowerCase().equals("а")){
                        if(SearchPrimeNumber(books.pages) == true){
                            resultBookTitles.add("\"" + books.bookTitle + "\"");
                        }   
                    }
                }
            }     
        }
        System.out.println(resultBookTitles);
    }

    /**
     * @return - метод, возвращает true, если количество страниц в книге простое.
     */
    public static boolean SearchPrimeNumber(int pNumber) {
        
        if(pNumber == 1){
            return false;
        }

        int count = 0;      
        for (int i = 2; i < pNumber-1; i++) {
            if(pNumber % i == 0){
                count += 1;
                break;
            }
        }   

        boolean result = count == 0;
        return result;
    }   

    public static List<Books> GetBook() {
        List<Books> books = new ArrayList<Books>();
        books.add(new Books("Евгений Онегин", "Пушкин", 1431, 2005, 320 , Arrays.asList(1, 2, 3, 4, 5)));
        books.add(new Books("Война и мир (В 4-х томах)", "Толстой", 6253, 2017, 992 , Arrays.asList(1, 2, 3, 4, 5)));

        books.add(new Books("Трагедия-буфф", "Маяковский", 1484, 2016, 720, Arrays.asList(1, 2, 3, 4, 5)));
        books.add(new Books("Что такое хорошо и что такое плохо?", "Маяковский", 641, 2003, 32, Arrays.asList(1, 2, 3, 4, 5)));

        books.add(new Books("Мастер и Маргарита", "Булгаков", 2060, 2021, 499, Arrays.asList(1, 2, 3, 4, 5)));
        books.add(new Books("Собачье сердце", "Булгаков", 832, 2006, 640, Arrays.asList(1, 2, 3, 4, 5)));

        books.add(new Books("Мороз, Красный нос", "Некрасов", 421, 2018, 48, Arrays.asList(1, 2, 3, 4, 5)));
        books.add(new Books("Дедушка Мазай и зайцы", "Некрасов", 621, 2009, 64, Arrays.asList(1, 2, 3, 4, 5)));
        
        books.add(new Books("Обыкновенная история", "Гончаров", 2977, 2019, 317, Arrays.asList(1, 2, 3, 4, 5)));
        books.add(new Books("Обломов", "Гончаров", 3752, 2003, 416, Arrays.asList(1, 2, 3, 4, 5)));
        
        return books;
    }
}
