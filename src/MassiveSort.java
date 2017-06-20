import java.util.Arrays;

/**
 * Created by Skorodielov on 17.05.2017.
 */
public class MassiveSort {
    public static void main(String[] args) {
        int[] array = {30, -5, 10, 24, 0, 1, 9};
        System.out.println(Arrays.toString(sortAscending(array)));
        System.out.println(Arrays.toString(sortDescending(array)));

    }


    static int[] sortAscending(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int imin = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    imin = j;
                }
            }
            if (i != imin) {
                int temp = array[i];
                array[i] = array[imin];
                array[imin] = temp;
            }
        }
        return array;
    }

    static int[] sortDescending(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int max = array[i];
            int imax = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > max) {
                    max = array[j];
                    imax = j;
                }
            }
            if (i != imax) {
                int temp = array[i];
                array[i] = array[imax];
                array[imax] = temp;
            }
        }
        return array;
    }
}