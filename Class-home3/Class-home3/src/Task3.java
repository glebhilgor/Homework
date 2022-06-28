import java.util.Random;

public class Task3 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[15];
        for (int i = 0; i < 15; i++) {
            array[i] = random.nextInt(99);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int sum = 0;
        for (int i = 0; i < 15; i++) {
            if (array[i] % 2 == 0 && array[i] > 0) {
                System.out.print(array[i] + " ");
                sum++;
            }
        }
        System.out.println();
        System.out.println(sum);
    }
}
