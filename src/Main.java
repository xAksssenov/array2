import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int n = 5;
        int m = 5;

        int[][] mas = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                //if (i - j == 0 || (i - j) % 2 == 0 || (j - i) % 2 == 0)
                //if (j == 2)
                //if (i == 2)
                //if (i == 2 || j == 2)
                //if (j % 2 == 0)
                //if (i % 2 == 0)
                //if (i == m - j - 1)
                //if (i >= m - j - 1)
                //if (i <= m - j - 1) {
                //    mas[i][j] = 1;
                //} else {
                //    mas[i][j] = 0;
                //}
                //if (j == i || i == m - j - 1) {
                if (i <= j && i + j <= m - 1 || i >= j && i + j >= m - 1) {
                    mas[i][j] = 1;
                } else {
                    mas[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("---------------");

        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
    }
}