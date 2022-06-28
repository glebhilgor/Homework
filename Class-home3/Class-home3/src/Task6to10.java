import java.util.Random;

public class Task6to10 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            int a = random.nextInt(50);
            array[i] = a;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        boolean diff = true;
        for (int i = 0; i < array.length; i++) {
            for (int a = 0; a < array.length; a++) {
                if (a == i) continue;
                if (array[i] == array[a]) {
                    diff = false;
                    break;
                }
            }
        }
        if (diff)
            System.out.println("Elements are not equal");
        else
            System.out.println("Elements are equal");
    }
}
