package Homework.Lesson_3.HW_Exercise_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/* Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
Получить наименования товаров заданного сорта с наименьшей ценой. */

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите сорт товара (1-4): ");
        Scanner sc = new Scanner(System.in);
        int searchСommodityGrade = sc.nextInt();

        List<Product> products = GetProduct();

        double totalPrice = 0;
        double lowestPrice = 0;
        List<String> lowPrice = new ArrayList<>();
        
        for (Product product : products) {
            if(searchСommodityGrade == product.commodityGrade){ // 1
                totalPrice += product.price;
            }   
        }
        
        for (int i = 0; i < products.size(); i++) {
            if(searchСommodityGrade == products.get(i).commodityGrade){ // 1
                lowestPrice = totalPrice / 5;

                if(products.get(i).price <= lowestPrice){
                    lowPrice.add(products.get(i).productName);
                }
            } 
        }
        System.out.println(lowPrice);
    }

    public static List<Product> GetProduct() {
        List<Product> product = new ArrayList<Product>();
        product.add(new Product("мука высший сорт", "Россия", 1.25, 49.90, 1, Arrays.asList(1, 2, 3, 4, 5)));
        product.add(new Product("мука зарубежная", "Италия", 1.50, 50.90, 2, Arrays.asList(1, 2, 3, 4, 5)));
        product.add(new Product("мука лучшая", "Германия", 1.00, 42.3, 3, Arrays.asList(1, 2, 3, 4, 5)));
        product.add(new Product("мука нормальная", "США", 1.25, 49.99, 4, Arrays.asList(1, 2, 3, 4, 5)));

        product.add(new Product("пшеница высший сорт", "Россия", 1.25, 58.70, 1, Arrays.asList(1, 2, 3, 4, 5)));
        product.add(new Product("пшеница зарубежная", "Италия", 1.50, 50, 2, Arrays.asList(1, 2, 3, 4, 5)));
        product.add(new Product("пшеница лучшая", "Германия", 1.0, 99.90, 3, Arrays.asList(1, 2, 3, 4, 5)));
        product.add(new Product("пшеница нормальная", "США", 1.25, 35.99, 4, Arrays.asList(1, 2, 3, 4, 5)));

        product.add(new Product("чечевица высший сорт", "Россия", 1.25, 105.56, 1, Arrays.asList(1, 2, 3, 4, 5)));
        product.add(new Product("чечевица зарубежная", "Италия", 1.50, 101.50, 2, Arrays.asList(1, 2, 3, 4, 5)));
        product.add(new Product("чечевица лучшая", "Германия", 1.0, 89.90, 3, Arrays.asList(1, 2, 3, 4, 5)));
        product.add(new Product("чечевица нормальная", "США", 1.25, 75.85, 4, Arrays.asList(1, 2, 3, 4, 5)));

        product.add(new Product("макароны высший сорт", "Россия", 1.25, 156.99, 1, Arrays.asList(1, 2, 3, 4, 5)));
        product.add(new Product("макароны зарубежные", "Италия", 1.50, 120.50, 2, Arrays.asList(1, 2, 3, 4, 5)));
        product.add(new Product("макароны лучшая", "Германия", 1.0, 135.90, 3, Arrays.asList(1, 2, 3, 4, 5)));
        product.add(new Product("макароны нормальные", "США", 1.25, 102.36, 4, Arrays.asList(1, 2, 3, 4, 5)));

        product.add(new Product("яйца высший сорт", "Россия", 0.400, 60.00, 1, Arrays.asList(1, 2, 3, 4, 5)));
        product.add(new Product("яйца зарубежные", "Италия", 0.350, 120.00, 2, Arrays.asList(1, 2, 3, 4, 5)));
        product.add(new Product("яйца лучшие", "Германия", 0.300, 100.00, 3, Arrays.asList(1, 2, 3, 4, 5)));
        product.add(new Product("яйца нормальные", "США", 0.300, 85.00, 4, Arrays.asList(1, 2, 3, 4, 5)));
        return product;
    }
}
