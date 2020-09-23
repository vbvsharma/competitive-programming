// https://www.hackerrank.com/challenges/staircase/problem

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        input.close();

        staircase(n);
    }

    private static void staircase(int n) {
        for (int line = 1; line <= n; line++) {
            // Print spaces
            for (int i = 1; i <= n-line ; i++)  System.out.print(" ");

            // Print #
            for (int i = 1; i <= line; i++)     System.out.print("#");

            System.out.println();
        }
    }
}
