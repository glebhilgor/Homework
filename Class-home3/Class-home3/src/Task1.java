public class Task1 {
    public static void main(String[] args) {

        int[] array = new int[20];
        int a = 2;
        for (int i = 0; i < 10; i++) {
            array[i] = a;
            a += 2;
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        int b = 2;
        for (int i = 0; i < 10; i++) {
            array[i] = b;
            b += 2;
            System.out.println(array[i] + " ");

        }
    }
}