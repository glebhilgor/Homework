import java.util.Random;

public class Matrix1 {
    public static void main(String[] args) {
// ����� [] - ������, ������ [] - �������
// massive.length - ���� ������ � ������ ����� �� ����������
        Random random = new Random();
        int[][] massive = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                massive[i][j] = random.nextInt(100);
                System.out.print(massive[i][j] + " ");
            }
            System.out.println();
        }
    }
}
