package Lesson_2.Exercise_4;

public class main {
    public static void main1(String[] args) {
        Vector vector = new Vector(1.0,2.0,3.0);
        Vector vector2 = new Vector(1.0,2.0,3.0);
        System.out.println(vector);
        System.out.println("vector.vectorLength() = " + vector.vectorLength());
        System.out.println(vector.scalar(vector2));
        System.out.println(vector.vectorPr(new Vector(1.0, 2.0, 3.0)));
        System.out.println(vector.vectorCos(new Vector(1.0, 2.0, 3.0)));

    }
}
