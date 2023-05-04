package Lesson_3.Exercise_2;

/* Дан массив объектов: фамилия студента, номер группы, размер стипендии, баллы по 3 предметам.
Определить стипендии студентов, фамилии которых заканчиваются на «ова», при четной сумме баллов. */

import java.util.*;

public class app {
    public static void main(String[] args) {
        List<Student> students = GetStudents();
        for(Student student: students) {
            if(student.name.endsWith("on") )
            {
                int sum = 0;
                for(Integer ball: student.balls){
                    sum += ball;
                } 
                if(sum % 2 == 0){
                    System.out.println(student.salary);
                }
            }
        }
    }

    public static List<Student> GetStudents()
    {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("name1on", 1111, 1000, Arrays.asList(1,2,3)));
        students.add(new Student("name2", 2222, 1200, Arrays.asList(2,4,3)));
        students.add(new Student("name3on", 3333, 1300, Arrays.asList(1,3,3)));
        students.add(new Student("name4", 4444, 1400, Arrays.asList(1,2,5)));
        students.add(new Student("name5", 2222, 1500, Arrays.asList(2,2,2)));
        students.add(new Student("name6", 3333, 1100, Arrays.asList(1,4,3)));
        students.add(new Student("name7on", 5555, 1200, Arrays.asList(6,2,5)));
        return students;
    }
}
