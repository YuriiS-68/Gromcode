package Lesson10.polyexample;

import Lesson10.polyexample.Child;
import Lesson10.polyexample.Human;
import Lesson10.polyexample.User;

/**
 * Created by Skorodielov on 15.06.2017.
 */
public class Demo {
    public static void main(String[] args) {

        Human human = new Human("Test");
        run(human);

        System.out.println();

        User user = new User("Jack");
        run(user);

        System.out.println();

        Child child = new Child("Gnom");
        run(child);

    }

    private static void run(Human human){
        human.run();
    }
    //4
}
