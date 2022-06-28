import java.util.Random;

public class Task1to10 {
    public static void main(String[] args) {

        Random random = new Random();
        int a = 1;
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.print(array[i] + " ");
            if (array[i] % 3 == 0) {
                a *= array[i];
            }
        }
        System.out.println();
        System.out.print("Summa kratnyh = " + a);
    }
}
