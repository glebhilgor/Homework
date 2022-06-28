import java.util.Random;

public class Task4to10 {
    public static void main(String[] args) {

        Random random = new Random();
        int h = 50;
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0 && array[i] < h) {
                h = array[i];
            }

        }
        System.out.print("Lowest odd element = " + h);
    }
}
