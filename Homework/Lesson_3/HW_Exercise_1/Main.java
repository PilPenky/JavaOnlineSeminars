package Homework.Lesson_3.HW_Exercise_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* Дан массив записей: наименование товара, цена, сорт. 
Найти наибольшую цену товаров 1го или 2го сорта среди товаров, название которых содержит «высший». */

public class Main {
    public static void main(String[] args) {

        List<Product> products = GetProduct();
        double totalPrice = 0;
        double highPrice = 0;
        int count = 0;

        for (Product product : products) {
            String[] str = product.productName.split(" ");
            for (int j = 0; j < str.length; j++) {
                if (str[j].equals("высший")) {
                    if ((product.commodityGrade == 1) || (product.commodityGrade == 2)) {
                        totalPrice += product.price;
                        count += 1;
                    }
                }
            }

        }

        ArrayList<String> highPriceArray = new ArrayList<>();
        highPrice = totalPrice / count;
        for (Product product : products) {
            if (product.price >= highPrice) {
                highPriceArray.add("\"" + product.productName + " - " + product.price + "\"");
            }

        }
        System.out.println("Товары с наибольшей ценой 1го и 2го сорта, название которых содержит слово \"высший\":");
        System.out.println(highPriceArray);
    }

    public static List<Product> GetProduct() {
        List<Product> product = new ArrayList<Product>();
        product.add(new Product("мука высший сорт", 49.90, 1, Arrays.asList(1, 2, 3)));
        product.add(new Product("мука краснодарская", 45, 2, Arrays.asList(1, 2, 3)));
        product.add(new Product("мука лучшая", 42.3, 3, Arrays.asList(1, 2, 3)));

        product.add(new Product("пшеница высший сорт", 58.70, 1, Arrays.asList(1, 3, 3)));
        product.add(new Product("пшеница краснодарская высший сорт", 50, 2, Arrays.asList(1, 3, 3)));
        product.add(new Product("пшеница лучшая", 99.90, 3, Arrays.asList(1, 3, 3)));

        product.add(new Product("чечевица высший сорт", 119.99, 1, Arrays.asList(1, 2, 5)));
        product.add(new Product("чечевица краснодарская высший сорт", 101.50, 2, Arrays.asList(2, 2, 2)));
        product.add(new Product("чечевица лучшая", 89.90, 3, Arrays.asList(2, 2, 2)));

        product.add(new Product("макароны высший сорт", 71.99, 1, Arrays.asList(1, 2, 5)));
        product.add(new Product("макароны краснодарские", 51.90, 2, Arrays.asList(2, 2, 2)));
        product.add(new Product("макароны лучшие", 61.40, 3, Arrays.asList(2, 2, 2)));

        product.add(new Product("перловка высший сорт", 61.90, 1, Arrays.asList(1, 2, 5)));
        product.add(new Product("перловка краснодарская", 45.00, 2, Arrays.asList(2, 2, 2)));
        product.add(new Product("перловка лучшая высший сорт", 41.90, 3, Arrays.asList(2, 2, 2)));

        return product;
    }
}