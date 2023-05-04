package Homework.Lesson_3.HW_Exercise_1;

import java.util.List;

/* Дан массив записей: наименование товара, цена, сорт. 
Найти наибольшую цену товаров 1го или 2го сорта среди товаров, название которых содержит «высший». */

public class Product {
    public String productName;
    public double price;
    public int commodityGrade;

    public Product(String productName, double price, int commodityGrade, List<Integer> asList) {
        this.productName = productName;
        this.price = price;
        this.commodityGrade = commodityGrade;
    }
}