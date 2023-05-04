package Homework.Lesson_2;

import java.util.Arrays;

/* Дана последовательность N целых чисел. Найти сумму простых чисел. */

/* Решение задачи реализованно на основании алгоритма нахождения простых чисел "решето Эратосфена" */

public class HW_Exercise_1 {
    public static void main(String[] args) {
        // String str = "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30"; // 129
        String str = "61 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89 90 91 92 93 94 95 96 97 98 99 100"; // 620
        System.out.println("Последовательность чисел: " + str);
        System.out.println("Простые числа в последовательности: " + Arrays.toString(removingZeros(primeNumberSearch(ArrOne(sizeArrOne(transferToArray(str)), transferToArray(str))))));
        System.out.println("Сумма простых чисел: " + sumPrimeNumber(removingZeros(primeNumberSearch(ArrOne(sizeArrOne(transferToArray(str)), transferToArray(str))))));
    }

    /**
     * @param arr - метод преобразует строки в массив чисел и возвращает массив чисел.
     */
    public static int[] transferToArray(String str) {
        // String[] strNums = str.split(" ");
        // int[] arr = new int[strNums.length];
        // for (int i = 0; i < strNums.length; i++) {
        // arr[i] = Integer.parseInt(strNums[i]);
        // }
        // return arr;

        int[] arr = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
        return arr;
    }

    /**
     * @param arr - метод, выявляющий размер для массива arrOne по четным числам.
     */
    public static int[] sizeArrOne(int[] arr) {
        int tI = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                continue;
            } else if (arr[i] == 2) {
                tI += 1;
            } else if (arr[i] % 2 != 0) {
                tI += 1;
            }
        }
        int[] arrOne = new int[tI];
        return arrOne;
    }

    /**
     * @param arrOne - метод, выявляющий нечетные элементы массива и передающий их значения в массив arrOne.
     */
    public static int[] ArrOne(int[] arrOne, int[] arr) {
        int tIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                continue;
            }
            if (arr[i] == 2) {
                arrOne[tIndex] = arr[i];
                tIndex += 1;
            }
            if (arr[i] % 2 != 0) {
                arrOne[tIndex] = arr[i];
                tIndex += 1;
            }
        }
        return arrOne;
    }

    /**
     * @param arrOne - возвращает массив простых чисел.
     */
    public static int[] primeNumberSearch(int[] arrOne) {
        int[] arrTwo = new int[arrOne.length];
        int count = 0;
        if (arrOne[0] > 3) {
            for (int i = 3; i < arrOne[0]; i++) {
                count += 1;
                i += 1;
            }
            arrTwo = new int[arrOne.length + count];
            int index = 0;
            for (int i = 3; i <= arrOne[arrOne.length - 1]; i++) {
                arrTwo[index] = i;
                i += 1;
                index += 1;
            }

            for (int i = 0; i < arrTwo.length; i++) {

                if (arrTwo[i] == 0) {
                    continue;
                }
                if (arrTwo[i] == 2) {
                    continue;
                }

                for (int j = i + 1; j < arrTwo.length; j++) {
                    if (arrTwo[i] == 0) {
                        continue;
                    }
                    if (arrTwo[j] == 0) {
                        continue;
                    }
                    if (arrTwo[j] % arrTwo[i] != 0) {
                        continue;
                    } else
                        arrTwo[j] = 0;
                }
            }

            for (int i = 0; i < arrTwo.length; i++) {
                if (arrTwo[i] < arrOne[0]) {
                    arrTwo[i] = 0;
                }
            }
        }

        if (arrOne[0] <= 3) {
            arrTwo = arrOne;
            for (int i = 0; i < arrTwo.length; i++) {

                if (arrTwo[i] == 0) {
                    continue;
                }

                if (arrTwo[i] == 2) {
                    continue;
                }

                for (int j = i + 1; j < arrTwo.length; j++) {
                    if (arrTwo[i] == 0) {
                        continue;
                    }
                    if (arrTwo[j] == 0) {
                        continue;
                    }
                    if (arrTwo[j] % arrTwo[i] != 0) {
                        continue;
                    } else
                        arrTwo[j] = 0;
                }
            }
        }
        // System.out.println(Arrays.toString(arrTwo));
        return arrTwo;
    }

    /**
     * @param arrTwo - метод, удаляющий нули в массиве.
     */
    public static int[] removingZeros(int[] arrTwo) {
        int countTwo = 0;
        for (int i = 0; i < arrTwo.length; i++) {
            if(arrTwo[i] != 0){
                countTwo += 1;
            }
        }

        int[] intResult = new int[countTwo];
        
        int countInd = 0;
        for (int i = 0; i < arrTwo.length; i++) {
            if(arrTwo[i] != 0){
                intResult[countInd] = arrTwo[i];
                countInd += 1;
            }
        }
        return intResult;
    }

    /**
     * @param result - возвращает сумму простых чисел
     */
    public static int sumPrimeNumber(int[] intResult) {
        int result = 0;
        for (int i = 0; i < intResult.length; i++) {
            result += intResult[i];
        }
        return result;
    }
}