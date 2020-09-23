// https://www.hackerrank.com/challenges/birthday-cake-candles/problem

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++)     ar[i] = input.nextInt();

        input.close();

        System.out.println(birthdayCakeCandles(ar));
    }

    private static int birthdayCakeCandles(int[] ar) {
        int max = Integer.MIN_VALUE;
        int maxCount = 0;

        for (int i = 0; i < ar.length; i++) {
            if (max < ar[i]) {
                max = ar[i];
                maxCount = 1;
            } else if (max == ar[i]) {
                maxCount++;
            }
        }

        return maxCount;
    }
}
