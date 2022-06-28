import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = 0;
        int n = scanner.nextInt();
        Random random = new Random();
        int horizont = n;
        int vertical = n;
        int[][] massive = new int[n][n];
        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive.length; j++) {
                massive[i][j] = random.nextInt(100);
                System.out.print(massive[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < horizont; i++) {
            for (int j = 0; j < vertical; j++) {
                if (i == j) {
                    a += massive[i][j];
                }
            }
        }
        System.out.println("Main diagonal sum " + a + " ");

    }
}
