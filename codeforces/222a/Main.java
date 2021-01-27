import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = input.nextInt();
        input.close();

        int count = 0;
        while (n - 1 - count >= 0) {
            if (a[n - 1] == a[n - 1 - count])
                count++;
            else
                break;
        }

        if (n - count < k) {
            System.out.println(n - count);
        } else {
            System.out.println(-1);
        }
    }
}