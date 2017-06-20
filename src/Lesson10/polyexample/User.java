package Lesson10.polyexample;

import Lesson10.polyexample.Human;

/**
 * Created by Skorodielov on 15.06.2017.
 */
public class User extends Human {

    public User(String name) {
        super(name);
    }

    @Override
    void run() {
        System.out.println("User class is called...");
        super.run();
    }
}
