package Lesson_1;

/* Для заданного целого числа n верните разницу между 
произведением его цифр и суммой его цифр. */

import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = iScanner.nextInt();
        iScanner.close();

        System.out.println(subtractProductAnsSum(a));
    }

    /**
     * 
     * @param a Задаваемое число.
     * @return Возвращает произведение минус сумма.
     */

    public static int subtractProductAnsSum(int a) {

        int product = 1;
        int sum = 0;
        while (a != 0)
        {
            product *= a % 10;
            sum += a % 10;
            a /= 10;
        }
        return product - sum;
    }
}
