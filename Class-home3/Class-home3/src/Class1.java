import java.util.Random;
import java.util.Scanner;

public class Class1 {
    public static void main(String[] args) {
// вывести на экран рандомный массив. Показать только четные из массива
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter the quantity of array");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0 && array[i] > 0) {
                System.out.println(array[i]);
            }
        }
    }
}
