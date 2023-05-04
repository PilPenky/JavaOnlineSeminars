package Lesson_2;

/* Реализовать pow(x, n) , который вычисляет x в степени n */

public class Exercise_1 {
    public static void main(String[] args) {
        
        System.out.println(myPow(2.000, -21474));

    }

    private static double myPow(double x, int n) {
        if(n < 0){
            n = -n;
            x = 1 / x;
        }
        
        double pow = 1;
        
        while(n != 0){
            if((n & 1) != 0){
                pow *= x;
            } 
                
            x *= x;
            n >>>= 1; 
        }
        return pow;
    }
}