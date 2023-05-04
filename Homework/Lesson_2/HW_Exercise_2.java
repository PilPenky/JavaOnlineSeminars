package Homework.Lesson_2;

/* Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей. */

public class HW_Exercise_2 {
    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        //int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 8, 9, 10};
        System.out.println(sequenceNumbers(array));
    }

    public static String sequenceNumbers(int[] array) {

        int count = 0;
        for (int i = 0; i < array.length-1; i++) {
            if((array[i] + 1) == array[i+1]){
                count += 1;
            }
        }

        String str;
        if(count == array.length-1){
            return str = "Последовательность является возрастающей :)";
        }
            return str = "Последовательность не является возрастающей :(";  
    }
}