import java.util.Random;

public class Main1 {
    public static void main(String[] args) {
        Random random = new Random();

        int n = 5;
        int m = 5;
        int[][] mas = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mas[i][j] = random.nextInt(70 - 30 + 1) + 30;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }

        int count = mas.length / 2;

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < count; j++) {
                int temp = mas[i][j];
                mas[i][j] = mas[i][mas.length - 1 - j];
                mas[i][mas.length - 1 - j] = temp;
            }
        }

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < mas.length; j++) {
                int temp = mas[i][j];
                mas[i][j] = mas[mas.length - 1 - i][j];
                mas[mas.length - 1 - i][j] = temp;
            }
        }

        System.out.println("Sorted array: ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
    }
}
