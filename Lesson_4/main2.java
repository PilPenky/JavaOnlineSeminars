package Lesson_4;

import java.util.Arrays;
import java.util.LinkedList;

/* Построить однонаправленный список целых чисел. Удалить отрицательные элементы списка */

public class main2 {
    public static void main(String[] args) {
        
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(-1, -2, -3, 4, 5, -6, -7, 8, -9));

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) < 0){
                list.remove(i);
                i -= 1;                
            }
        }
        System.out.println(list);
    }
}