import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int d = input.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = input.nextInt();
        
        input.close();
        
        int[] result = leftRotation(n, d, a);

        for (int i = 0; i < n; i++)
            System.out.print(result[i] + " ");
        System.out.println();
    }

    private static int[] leftRotation(int n, int d, int[] a) {
        int[] result = new int[n];

        for (int i = 0; i < (d % n); i++)
            result[n - (d % n) + i] = a[i];
        
        for (int i = (d % n); i < n; i++)
            result[i - (d % n)] = a[i];
        
        return result;
    }
}
