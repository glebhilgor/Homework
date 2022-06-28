import java.util.Random;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int a = 0;
        int n = scanner.nextInt();
        if (n >= 3) {
            System.out.println(n);

            int[] array1 = new int[n];
            for (int i = 0; i < array1.length; i++) {
                array1[i] = random.nextInt(n);
                System.out.print(array1[i] + " ");
            }
        } else {
            System.out.println("Incorrect");
        }
        System.out.println();
        int[] array2 = new int[n];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = a;
            a += 2;
            System.out.print(array2[i] + " ");
        }
    }
}