public class Task2 {
    public static void main(String[] args) {

        int[] array = new int[100];
        int a = 1;
        for (int i = 0; i < 50; i++) {
            array[i] = a;
            a += 2;
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        int b = 99;
        for (int i = 49; i >= 0; i--) {
            array[i] = b;
            b -= 2;
            System.out.print(array[i] + " ");
        }
        }
    }