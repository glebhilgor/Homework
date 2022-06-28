import java.util.Random;

public class Task2to10 {
    public static void main(String[] args) {

        Random random = new Random();
        int h = 0;
        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = random.nextInt(15);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        double arf = 0;
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                sum = sum + array[i];
                h++;
            }
        }
        arf = sum / h;
        System.out.print(arf);
    }
}