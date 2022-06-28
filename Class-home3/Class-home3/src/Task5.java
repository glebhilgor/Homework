import java.util.Random;

public class Task5 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] array1 = new int[5];
        for (int i = 0; i < 5; i++) {
            array1[i] = random.nextInt(15);
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        int[] array2 = new int[5];
        for (int i = 0; i < 5; i++) {
            array2[i] = random.nextInt(15);
            System.out.print(array2[i] + " ");
        }
        System.out.println();
        double arf1 = 0;
        double arf2 = 0;
        double sum1 = 0;
        double sum2 = 0;
        for (int i = 0; i < array1.length; i++) {
            sum1 = sum1 + array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            sum2 = sum2 + array2[i];
        }
        System.out.println();
        arf1 = sum1/5;
        arf2 = sum2/5;
        if (arf1<arf2) {
            System.out.println("Srednee pervogo menshe vtorogo");
        } else if (arf2<arf1) {
            System.out.println("Srednee vtorogo menshe pervogo");
        } else {
            System.out.println("Ravny");
        }

    }
}