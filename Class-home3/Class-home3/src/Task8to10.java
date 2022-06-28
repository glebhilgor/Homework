import java.util.Arrays;
import java.util.Random;

public class Task8to10 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(array[3]);
    }
}
