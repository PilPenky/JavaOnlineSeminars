package Lesson_3.Exercise_2;

/* Дан массив объектов: фамилия студента, номер группы, размер стипендии, 
баллы по 3 предметам.
Определить стипендии студентов, фамилии которых заканчиваются на «ова», 
при четной сумме баллов. */

import java.util.*;

public class Student {
    public String name;
    public int number;
    public double salary;    
    public List<Integer> balls;

    public Student (String name, int number, double salary, List<Integer>  balls) {
        this.name = name;
        this.number = number;
        this.salary = salary;
        this.balls = balls;
    }
}