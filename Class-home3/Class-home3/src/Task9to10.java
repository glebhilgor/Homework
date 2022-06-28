import java.util.Random;

public class Task9to10 {
    public static void main(String[] args) {

        Random random = new Random();
        int a = 10;
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i += 2) {
            if (array[i] < a) ;
            a = array[i];
        }
        System.out.print("Lowest element from even index " + a);
    }
}
