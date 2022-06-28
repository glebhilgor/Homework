import java.util.Random;

public class Task6 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[4];                 //{1, 2, 3, 4};
        for (int i = 0; i < 4; i++) {
            array[i] = random.nextInt(10);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        boolean marker = true;
        for (int i = 0; i < array.length - 1; i++)
            if (array[i] > array[i + 1]) {
                marker = false;
                break;
            }
        if (marker) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
