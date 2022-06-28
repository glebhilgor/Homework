public class Class3 {
    public static void main(String[] args) {
        int[] array = new int[5];
        array[0] = 5;
        array[1] = 7;
        array[2] = 6;
        array[3] = 12;
        array[4] = 22;
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }
        System.out.println("-----------------");

        int[] array1 = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < 5; i++) {
            System.out.println(array1[i]);
        }
        System.out.println(array1[4]);
    }
}
