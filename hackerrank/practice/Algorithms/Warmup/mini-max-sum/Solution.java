// https://www.hackerrank.com/challenges/mini-max-sum/problem

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < 5; i++)     arr[i] = input.nextInt();

        input.close();

        minMaxSum(arr);
    }

    private static void minMaxSum(int[] arr) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        long total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];

            if (arr[i] < min)   min = arr[i];
            if (max < arr[i])   max = arr[i];
        }

        System.out.println((total - max) + " " + (total - min));
    }
}
