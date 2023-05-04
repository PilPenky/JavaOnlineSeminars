package Homework.Lesson_4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

/* Вывести список на экран в перевернутом виде (без массивов и ArrayList) */

public class HW_Exercise_1 {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        LinkedList st = new LinkedList();

        while(list.size() > 0){
            st.push(list.pop());
        }
        System.out.println(st);
    }


}