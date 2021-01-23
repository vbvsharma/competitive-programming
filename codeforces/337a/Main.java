import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[] f = new int[m];
        for (int i = 0; i < m; i++)
            f[i] = input.nextInt();
        input.close();

        Arrays.sort(f);

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < m - n + 1; i++) {
            if (f[i + n - 1] - f[i] < min)
                min = f[i + n - 1] - f[i];
        }

        System.out.println(min);
    }
}