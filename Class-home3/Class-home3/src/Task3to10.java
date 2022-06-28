import java.util.Random;

public class Task3to10 {
    public static void main(String[] args) {

        Random random = new Random();
        int c = 10;
        int sum = 0;
        int index = 0;
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(15);
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println("C is " + c);
        for (int i = 0; i < array.length; i++) {
            if (array[i] > c) {
                sum += array[i];
                index++;
            }
        }
        double arf = sum / index;
        System.out.print("Arifmet " + arf);
    }
}
