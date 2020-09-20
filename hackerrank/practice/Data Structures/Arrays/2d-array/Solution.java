// https://www.hackerrank.com/challenges/2d-array/problem

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 6; i++)
            for (int j = 0; j < 6; j++)
                arr[i][j] = input.nextInt();
        
        System.out.println(hourglassSum(arr));

        input.close();
    }

    private static int hourglassSum(int[][] arr) {
        int sum = Integer.MIN_VALUE;

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                int tempSum = arr[i][j];
                tempSum += arr[i-1][j-1];
                tempSum += arr[i-1][j];
                tempSum += arr[i-1][j+1];
                tempSum += arr[i+1][j-1];
                tempSum += arr[i+1][j];
                tempSum += arr[i+1][j+1];

                if (tempSum > sum) {
                    sum = tempSum;
                }
            }
        }

        return sum;
    }
}
