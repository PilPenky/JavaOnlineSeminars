package Homework.Lesson_3.HW_Exercise_2;

import java.util.List;

/* Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
Получить наименования товаров заданного сорта с наименьшей ценой. */

public class Product {

    public String productName;
    public String country;
    public double weight;
    public double price;
    public int commodityGrade;

    public Product(String productName, String country, double weight, double price, int commodityGrade, List<Integer> asList) {
        this.productName = productName;
        this.country = country;
        this.weight = weight;
        this.price = price;
        this.commodityGrade = commodityGrade;
    }    
}
