import java.util.Arrays;
import java.util.Random;

public class Task10to10 {
    public static void main(String[] args) {

        Random random = new Random();
        int a = 0;
        int b = 0;
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] > a) ;
            a = array[i];
            b = i;
        }
        array[b - 1] = array[0];
        array[0] = a;
        System.out.println(Arrays.toString(array));
    }
}