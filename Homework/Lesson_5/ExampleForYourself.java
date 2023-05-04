package Homework.Lesson_5;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class ExampleForYourself {
    public static void main(String[] args) {

        // Создаём хэш-карту
        TreeMap<String, Double> tm = new TreeMap<>();

        // Помещаем элементы в карту
        tm.put("Заря", 3434.34);
        tm.put("Марк", 123.22);
        tm.put("Яна", 35.14);
        tm.put("Айян", 1378.00);
        tm.put("Дэйзи", 99.22);
        tm.put("Михаил", -19.08);

        // Получаем вид элементов
        Set set = tm.entrySet();

        // Получаем итератор
        Iterator i = set.iterator();

        // Отображаем элементы
        while (i.hasNext()) {
            Map.Entry me = (Map.Entry) i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        // Вносим 1000 на счёт Зари
        double balance = ((Double) tm.get("Заря")).doubleValue();
        tm.put("Заря", balance + 1000);
        System.out.println("Новый баланс Зари: " + tm.get("Заря"));
        System.out.println();
        
        // Сортируем по значению
        List<Entry<String, Double>> list = tm.entrySet().stream()
                .sorted((e1, e2) -> -e1.getValue().compareTo(e2.getValue()))
                .collect(Collectors.toList());

        System.out.println();
        System.out.println(list);

    }
}