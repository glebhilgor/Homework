import java.util.Arrays;
import java.util.Random;
// пузырьковая сортировка
public class Task11 {
    public static void main(String[] args) {
        Random random = new Random();
        //      int [] array = {8, 4, 5, 1, 6};
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int a;
        boolean list = false;
        while (!list) {
            list = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    list = false;
                    a = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = a;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}

