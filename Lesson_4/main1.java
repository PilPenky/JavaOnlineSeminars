package Lesson_4;

import java.util.Arrays;
import java.util.LinkedList;

/* Заменить некратные 3 элементы списка, суммой нечетных элементов. */

public class main1 {
    public static void main(String[] args) {
        
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 25, 45, 24, 26, 78, 90, 100));

        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 != 0){
                sum += list.get(i);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) % 3 != 0){
                list.set(i, sum);
            } 
        }

        System.out.println(list);
    }
    
}
