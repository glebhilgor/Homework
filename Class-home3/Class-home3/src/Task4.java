import java.util.Random;

public class Task4 {
    public static void main(String[] args) {


        Random random = new Random();
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = random.nextInt(20);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 20; i+=2) {
            if (array[i] % 2 != 0) {
                array[i] = 0;
            }
            System.out.print(array[i] + " ");
        }

    }
}


