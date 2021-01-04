import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] grid = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int x = input.nextInt();
                grid[i][j] += x;

                int[] arrI = {-1, 0, 1, 0};
                int[] arrJ = {0, 1, 0, -1};

                for (int k = 0; k < 4; k++) {
                    int sideI = i + arrI[k];
                    int sideJ = j + arrJ[k];
                    if (0 <= sideI && sideI < 3 && 0 <= sideJ && sideJ < 3)
                        grid[sideI][sideJ] += x;
                }
            }
        }

        input.close();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(grid[i][j] % 2 == 0 ? 1 : 0);
            System.out.println();
        }
    }
}