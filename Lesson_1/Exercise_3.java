package Lesson_1;

/* Дана строка. Поменять местами ее половины. */

public class Exercise_3 {
    public static void main(String[] args) {

        System.out.println(replacePartOfString("I love walking by the sea..."));
            
    }
    
    public static String replacePartOfString(String str) {
        int lenght = str.length();
        String sub1 = str.substring(0, lenght / 2);
        String sub2 = str.substring(lenght / 2, lenght);

        return sub2 + sub1;
    
    }
}
