package Homework.Lesson_1;

/* Дана последовательность целых чисел, оканчивающаяся нулем.
Найти сумму положительных чисел, после которых следует отрицательное число.
Пример ввода:
1 2 1 2 -1 1 3 1 3 -1 0
Логика расчета:
2 -1 переход -> 2 в сумму
3 -1 переход -> 3 в сумму
Пример вывода: 5 */

import java.util.Scanner;
import java.util.Arrays;

public class HW_Exercise_2 {
    public static void main(String[] args) {

        System.out.println("Введите целые числа:\nДля остановки ввода чисел укажите нуль '0'");

        String numbers = userNumbers();
        System.out.println("Сумма положительных чисел, после которых следует отрицательное число: " + (countSum(convertsToIntegerArray(numbers))));
    }

    /**
     * 
     * @param num - Строка.
     * @return - Возвращается строка из введенных чисел с консоли.
     */
    
    public static String userNumbers() {

        String num = "";
        Scanner iScanner = new Scanner(System.in);

        while(true) {
            int n = iScanner.nextInt();
            if(n == 0)
            {
                System.out.println("----");
                break;
            }
            else num += n + " ";
        }
        iScanner.close();
        return num;
    }

    /**
     * 
     * @param numArr - Массив чисел из строк.
     * @return - Возвращает конвертированный массив чисел из строк.
     */

    public static int[] convertsToIntegerArray(String num) {

        int[] numArr = Arrays.stream(num.split(" ")).mapToInt(Integer::parseInt).toArray();
        return numArr;
    }
    
    /**
     * 
     * @param count - Искомое число.
     * @return - Возвращает сумму положительных чисел, после которых следует отрицательное число.
     */

    public static int countSum(int[] numArr) {

        int count = 0;
        for (int i = 1; i < numArr.length; i++) {
            if(numArr[i] < 0) count += numArr[i - 1];
        }
        return count;
    }
}