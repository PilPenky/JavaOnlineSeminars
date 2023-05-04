package Homework.Lesson_4;

import java.util.Stack;

public class HW_Exercise_2 {
    public static void main(String[] args) {

        // String s = "()"; // true
        // String s = "()[]{}"; // true
        // String s = "(]"; // false
        // String s = "[([]])"; // false
        // String s = "{[]}"; // true
        // String s = "[([]])"; // false
        String s = "({[]})"; // true

        System.out.println(isValid(s));

    }

    public static boolean isValid(String s) {

        if (s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> result = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') {

                char c = '(';

                if (s.charAt(i) == '}') {
                    c = '{';
                }

                if (s.charAt(i) == ']') {
                    c = '[';
                }

                if (result.isEmpty() || result.pop() != c) {
                    return false;
                }

            } else {
                result.push(s.charAt(i));
            }
        }
        return result.isEmpty();
    }
}