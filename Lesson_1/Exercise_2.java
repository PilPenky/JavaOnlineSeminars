package Lesson_1;

/* Дана последовательность N целых чисел.
Найти количество положительных чисел, после которых следует отрицательное число. */

import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        int n = iScanner.nextInt();
        System.out.println(countDiff(n, iScanner)); 
        iScanner.close();  
        }     
    
    /**
     * 
     * @param n Количество чисел в последовательности.
     * @return - Возвращает количество положительных чисел
     */

    public static int countDiff(int n, Scanner iScanner) {
        int count = 0;
        int a = iScanner.nextInt();
        for (int i = 0; i < n-1; i++) {
            int b = iScanner.nextInt();
            if (a > 0 && b < 0) {
                count++;
            }
            a = b;
        }
        return count;
    }
}