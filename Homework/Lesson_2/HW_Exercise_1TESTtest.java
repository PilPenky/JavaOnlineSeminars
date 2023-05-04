package Homework.Lesson_2;

import java.util.Arrays;

public class HW_Exercise_1TESTtest {
    public static void main(String[] args) {
        
        //String str = "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30";
        //String str = "23 24 25 26 27 28 29 30";
        //String str = "6 7 8 9 10 11 12 13 14 15";

        String str = "28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89 90 91 92 93 94 95 96 97 98 99 100";

        int[] arr = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();

        /* Метод, выявляющий размер для массива arrOne по четным числам */
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

        /* Метод, выявляющий нечетные элементы массива и передающий их значения в массив arrOne */
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
        System.out.println(Arrays.toString(arrOne));

        // далее -->

        int[] arrTwo = new int[arrOne.length];
        int count = 0;
        if(arrOne[0] > 3){
            for (int i = 3; i < arrOne[0]; i++) {
                count += 1;
                i += 1;
            }
            //System.out.println(count);
            
            arrTwo = new int[arrOne.length + count];
            
            int index = 0;
            for (int i = 3; i <= arrOne[arrOne.length-1]; i++) {
                arrTwo[index] = i;
                i += 1;
                index += 1;
            }
            System.out.println(Arrays.toString(arrTwo));
        }
        

        ///////////////

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
        // System.out.println(Arrays.toString(arrOne));

        String aa = "";
        for (int i = 0; i < arrTwo.length; i++) {
            if (arrTwo[i] != 0) {
                aa += arrTwo[i] + " ";
            }
        }
        System.out.println(aa);

        ////////

        for (int i = 0; i < arrTwo.length; i++) {
            if(arrTwo[i] < arrOne[0]){
                arrTwo[i] = 0;
            }            
        }
        System.out.println(Arrays.toString(arrTwo));


    }
}