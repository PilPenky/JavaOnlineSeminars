package Homework.Lesson_2;

import java.util.Arrays;

/* Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива. */

public class HW_Exercise_3 {
    public static void main(String[] args) {
        int[] arr = new int[] { -100, -10, -99, 101, 99, 100 };
        System.out.println(Arrays.toString(changeNegativeArrayElements(arr, sumIndex(arr))));
    }

    /**
     * @return Метод находит сумму индексов двузначных элементов массива и возвращает целое число (count).
     */
    public static int sumIndex(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (((arr[i] > -100) && (arr[i] <= -10)) || ((arr[i] >= 10) && (arr[i] <= 99))) {
                count += i;
            }
        }
        return count;
    }

    /**
     * @return Метод производит замену отрицательных элементов массива на count и возвращает целочисленный массив.
     */
    public static int[] changeNegativeArrayElements(int[] arr, int count) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = count;
            }
        }
        return arr;
    }
}