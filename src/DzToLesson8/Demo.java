package DzToLesson8;
import java.util.Arrays;

import static java.lang.Math.round;

/**
 * Created by Skorodielov on 09.06.2017.
 */
public class Demo {
    public static void main(String[] args) {
        Adder adder = new Adder();
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round(Math.random() * 100);
        }
        System.out.println(adder.add(50, 28));
        System.out.println(Arrays.toString(array));
        System.out.println(adder.check(array));
    }
}
