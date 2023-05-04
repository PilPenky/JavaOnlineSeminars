package Homework.Lesson_1;

/* Изменить порядок слов на противоположный.
Слово определяется как последовательность не пробельных символов.
Нужно возвратить строку слов в обратном порядке, объединенных одним пробелом.

Обратите внимание, что строка может содержать начальные или конечные пробелы или несколько пробелов между двумя словами. 
Возвращаемая строка должна содержать только один пробел, разделяющий слова. Не включайте никаких дополнительных пробелов. */

public class HW_Exercise_1 {
    public static void main(String[] args) {

        System.out.println(wordReversal("  blue  is   sky    the  :)     world hello   "));
    }

    public static String wordReversal(String str) {
        
        str = str.trim().replaceAll("\\s+", " ");

        String[] words = str.split(" ");

        String newWords = "";
        for (int i = 0; i < words.length; i++) {
            
            if(i == words.length-1) newWords = words[i] + newWords;
            else newWords = " " + words[i] + newWords;      
        }
        return newWords;
    }
}