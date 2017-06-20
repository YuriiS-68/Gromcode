package DzToLesson8;

import java.util.Arrays;


/**
 * Created by Skorodielov on 09.06.2017.
 */
public class Arithmetic {

    public boolean check(int[] array){
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
            if (array[i] < min){
                min = array[i];
            }
        }
        int sum = max + min;
        if (sum > 100)
            return true;
        else
            return false;
    }
}