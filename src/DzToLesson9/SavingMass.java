package DzToLesson9;

import java.util.Arrays;

/**
 * Created by Skorodielov on 13.06.2017.
 */
public class SavingMass {
    public static void main(String[] args) {
        savingMass(9);
        System.out.println(Arrays.toString(array));

    }

    static int[] array = {2, 5, 0, 7};

    static int[] savingMass(int number){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0){
                array[i] = number;
            }
        }
        return array;
    }
}
