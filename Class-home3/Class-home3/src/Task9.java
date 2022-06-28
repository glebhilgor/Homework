import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int q = 0;
        int ar1 = 0;
        int ar2 = 0;
        int a = scanner.nextInt();
        if (a > 0 && a % 2 == 0) {
            System.out.println(a);
            int[] array = new int[a];
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(15);
            }
            q = array.length / 2;
            for (int i = 0; i < q; i++) {
                ar1 = ar1 + array[i];
            }
            for (int i = 0; i < array.length; i++) {
            }
            if (ar1 < ar2) {
                System.out.print("First half is less");
            } else if (ar1 > ar2) {
                System.out.print("Second hals is less");
            } else {
                System.out.print("Equal");
            }
            System.out.println(Arrays.toString(array));
            System.out.println();
        } else {
            System.out.println("Incorrect number");
        }
    }
}