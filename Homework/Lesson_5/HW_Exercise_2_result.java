package Homework.Lesson_5;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.stream.Collectors;

/* Пусть дан список сотрудников:
Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, 
Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов

Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности. */

public class HW_Exercise_2_result {
    public static void main(String[] args) {

        LinkedList<String> text = new LinkedList<>(Arrays.asList(
                "Иван Иванов", "Светлана Петрова", "Кристина Белова",
                "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов",
                "Мария Федорова", "Марина Светлова", "Мария Савина", "Мария Рыкова", "Марина Лугова",
                "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов"));

        printList(sortingDecrease(convertsToTreemap(text)));
    }

    /**
     * @return - метод преобразует принятый текст в TreeMap и возвращает его.
     */
    private static TreeMap<String, Integer> convertsToTreemap(LinkedList<String> text) {
        TreeMap<String, Integer> tMap = new TreeMap<>();
        for (int i = 0; i < text.size(); i++) {
            String[] a = text.get(i).split(" ");
            for (int j = 0; j < 1; j++) {
                tMap.putIfAbsent(a[0], 0);
                tMap.put(a[0], tMap.get(a[0]) + 1);
            }
        }
        return tMap;
    }

    /**
     * @return - метод печатает TreeMap.
     */
    /*
     * public static TreeMap<String, Integer> printTreeMap(TreeMap<String, Integer>
     * tMap) {
     * for (var entry : tMap.entrySet()) {
     * System.out.println(entry.getKey() + " - " + entry.getValue());
     * }
     * return tMap;
     * }
     */

    /**
     * @return - метод преобразует принятый TreeMap в List и возвращает его.
     */
    public static List<Entry<String, Integer>> sortingDecrease(TreeMap<String, Integer> tMap) {
        List<Entry<String, Integer>> list = tMap.entrySet().stream()
                .sorted((e1, e2) -> -e1.getValue().compareTo(e2.getValue()))
                .collect(Collectors.toList());

        return list;
    }

    /**
     * @return - метод печатает list.
     */
    public static List<Entry<String, Integer>> printList(List<Entry<String, Integer>> list) {
        for (var entry : list) {
            System.out.println(((Entry<String, Integer>) entry).getKey() + " - " + entry.getValue());
        }

        return list;
    }
}