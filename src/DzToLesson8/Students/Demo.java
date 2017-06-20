package DzToLesson8.Students;

import java.util.Arrays;
import java.util.Date;

/**
 * Created by Skorodielov on 09.06.2017.
 */
public class Demo {
    public static void main(String[] args) {
       // Course[] course = new Course[0];

        createHighestParent();
        createLowestChild();

    }

    public static Student createHighestParent(){
        Course[] course = new Course[0];
        Student st = new Student("Ivan", "Ivanov", 1, course);
        return st;
    }

    public static SpecialStudent createLowestChild(){
        Course[] course = new Course[0];
        SpecialStudent ss = new SpecialStudent("Nikolai", "Petrov", 3, course, 5476, "np@gmail.com");
        return ss;
    }
}
