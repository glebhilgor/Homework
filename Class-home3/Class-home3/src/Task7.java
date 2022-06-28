import java.util.Random;

public class Task7 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[12];
        int max = 0;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(15);
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= max) {
                max = array[i];
                index = i;
            }
        }
        System.out.println();
        System.out.println("Max element " + array[index]);
        System.out.println("Index " + index);

    }
}

