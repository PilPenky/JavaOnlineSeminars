package Lesson_3.Exercise_1;

import java.util.List;

public class Product {

    String name;

    String country;

    Integer volume;

    public Product(String name, String country, Integer volume) {
        this.name = name;
        this.country = country;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", volume=" + volume +
                '}';
    }

}