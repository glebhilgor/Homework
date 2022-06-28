import java.util.Random;

public class Task7to10 {
    public static void main(String[] args) {

        Random random = new Random();
        int a = 10;
        int b = 0;
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == a) ;
            b++;
        }
        System.out.print("Element A is shows " + b + " times");
    }
}
