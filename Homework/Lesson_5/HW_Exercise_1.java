package Homework.Lesson_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Homework.Lesson_2.newnew;

/* Подсчитать количество искомого слова, через map (наполнением значение, где искомое слово будет являться ключом), вносить все слова не нужно.
Пример:
Россия идет вперед всей планеты. Планета — это не Россия.
Запрос: Россия
Ответ: Россия - 2
(Усложнение - игнорировать пунктуацию)*/

public class HW_Exercise_1 {
    public static void main(String[] args) {
        String str = "Russia goes ahead of the whole planet. The planet - is not Russia.";
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите искомое слово: ");
        String userWord = iScanner.next().toLowerCase();
        iScanner.close();
        printMap(CountSearchWords(userWord, fillingMap(removePunctuation(str))));
    }

    /**
     * @return - метод возвращает массив строк с убранными знаками пунктуации и с нижним регистром.
     */
    public static String[] removePunctuation(String str) {
        String tStr = str.replaceAll("\\p{Punct}", "").toLowerCase();
        String[] words = tStr.split(" ");
        return words;
    }

    /**
     * @return - метод добавляет в map строку с текстом.
     */
    public static Map<Integer, String> fillingMap(String[] str) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        for (int i = 0; i < str.length; i++) {
            map.put(i, str[i]);
        }
        return map;
    }

    /**
     * @return - метод считает количество искомого слова.
     */
    public static Map<String, Integer> CountSearchWords(String userWord, Map<Integer, String> map) {
        int count = 1;
        Map<String, Integer> resultMap = new HashMap<String, Integer>();
        for (int i = 0; i < map.size(); i++) {
            if(map.get(i).equals(userWord)){
                resultMap.put(userWord, count);
                count += 1;
            }

        }
        return resultMap;
    }

    /**
     * @param map - метод печатает результат resultMap.
     */
    public static void printMap(Map<String, Integer> map) {
        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}