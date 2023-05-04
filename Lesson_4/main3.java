package Lesson_4;

import java.util.Arrays;
import java.util.Stack;

/* Если задана строка path, представляющая собой абсолютный путь 
(начинающийся с косой черты '/') к файлу или каталогу в файловой системе в стиле Unix, преобразуйте ее в упрощенный канонический путь. 

В файловой системе в стиле Unix точка '.' относится к текущему каталогу,
двойная точка '..'относится к каталогу на более высокий уровень,
а несколько последовательных косых черт (например, '//') рассматриваются как одна косая черта '/'.
Для этой проблемы любой другой формат точек, например, '...'рассматривается как имя файла/каталога.

Канонический путь должен иметь следующий формат:
    - Путь начинается с одной косой черты '/'.
    - Любые два каталога разделяются косой чертой '/'.
    - Путь не заканчивается трейлингом '/'.
    - Путь содержит только каталоги на пути от корневого каталога к целевому файлу или каталогу (т. е. без точки '.'или двойной точки '..').
Вернуть упрощенный канонический путь .

*/

public class main3 {
    public static void main(String[] args) {
        //System.out.println(simplifyPath("/home/"));
        System.out.println(simplifyPath("/../"));
        //System.out.println(simplifyPath("/home//foo/"));

    }

    public static String simplifyPath(String path) {
        String[] arrayStr = path.split("/");
        System.out.println(Arrays.toString(arrayStr));

        Stack<String> result = new Stack<>();
        for (int i = 0; i < arrayStr.length; i++) {
            if (arrayStr[i].equals("..")) {
                if (!result.isEmpty()) {
                    result.pop();
                }
            } else if((!arrayStr[i].isEmpty()) && (!arrayStr[i].equals("."))){
                result.add(arrayStr[i]);
            }
        }
        System.out.println(result + "аааа");
        System.out.println();

        String resStr = "/";
        for (int i = 0; i < result.size(); i++) {
            resStr += result.get(i) + "/";   
            System.out.println(resStr + "-----");         
        }
        
        if(resStr.length() > 1){
            return resStr.substring(0, resStr.length()-1);
        }
        return resStr;
        
    }


}
