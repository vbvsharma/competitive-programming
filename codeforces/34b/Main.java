import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = input.nextInt();

        input.close();

        Arrays.sort(a);

        int maxProfit = 0;
        int i = 0;
        while (i < m && a[i] < 0) {
            maxProfit += -a[i];
            i++;
        }

        System.out.println(maxProfit);
    }
}