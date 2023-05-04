package Lesson_3.Exercise_3;

/* Даны следующие сведения о кубиках: размер каждого кубика (длина ребра в целых сантиметрах), его цвет (красный, желтый, зеленый тд)
и материал (деревянный, металлический, картонный и тд.).
Найти:
- количество кубиков желтого цвета и их суммарный объем;
           - количество деревянных кубиков с ребром 3 см
 */

public class Cube {
    public float length;
    public String color;
    public String material;


    public Cube(float length, String color, String material){
        this.length = length;
        this.color = color;
        this.material =material;
    }

    public float getVolume(){
        return length * length * length;
    }
}