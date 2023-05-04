package Homework.Lesson_3.HW_Exercise_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;

/* Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка. */

public class main {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println("Максимальное значение: " + Collections.max(list));
        System.out.println("Минимальное значение: " + Collections.min(list));
         
        double avg = getAverage(list);
        System.out.println("Среднее значение: " + avg);
    }

    /**
     * @return - метод вычисляющий среднее значение.
     */
    private static double getAverage(ArrayList<Integer> list) {
        IntSummaryStatistics stats = list.stream()
                .collect(Collectors.summarizingInt(Integer::intValue));
        return stats.getAverage();
    }
 
}
