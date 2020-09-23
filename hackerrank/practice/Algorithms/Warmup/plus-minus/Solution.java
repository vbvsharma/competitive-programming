import java.util.Scanner;

public class Solution {
    public static void  main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = input.nextInt();
        
        input.close();

        plusMinus(arr, n);
    }

    private static void plusMinus(int[] arr, int n) {
        int plus = 0, minus = 0, zeros = 0;

        for (int i = 0; i < n; i ++) {
            if (arr[i] < 0)         minus++;
            else if (arr[i] > 0)    plus++;
            else                    zeros++;
        }

        System.out.printf("%.6f\n", plus * 1.0 / n);
        System.out.printf("%.6f\n", minus * 1.0 / n);
        System.out.printf("%.6f\n", zeros * 1.0 / n);
    }
}
