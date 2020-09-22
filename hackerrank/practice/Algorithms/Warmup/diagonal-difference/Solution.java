import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                arr[i][j] = input.nextInt();
        
        input.close();

        System.out.println(findDiagonalDifference(arr));
    }

    private static int findDiagonalDifference(int[][] arr) {
        int sumDiagonalLR = 0, sumDiagonalRL = 0;

        for (int i = 0; i < arr.length; i++) {
            sumDiagonalLR += arr[i][i];
            sumDiagonalRL += arr[i][arr.length-1-i];
        }

        return Math.abs(sumDiagonalLR - sumDiagonalRL);
    }
}
