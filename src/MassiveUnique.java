/**
 * Created by Skorodielov on 07.06.2017.
 */
public class MassiveUnique {
    public static void main(String[] args) {
        int[] array = {9, 12, 10, 5, 4, 44, 100, 11, 44, 10, 11};
        System.out.println(uniqueCount(array));

    }

    static int uniqueCount(int[] array){
        int result = 0;

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[j] == array[i]){
                    count++;
                    break;
                }
            }
        }
        return result = array.length - count;
    }
}
