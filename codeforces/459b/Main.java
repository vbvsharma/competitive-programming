import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] b = new int[n];
        for (int i = 0; i < n; i++)
            b[i] = input.nextInt();
        input.close();

        long min = Long.MAX_VALUE, max = Long.MIN_VALUE,
                     minCount = 0, maxCount = 0;
        for (int i = 0; i < n; i++) {
            if (b[i] < min) {
                min = b[i];
                minCount = 1;
            } else if (b[i] == min) {
                minCount++;
            }

            if (max < b[i]) {
                max = b[i];
                maxCount = 1;
            } else if (max == b[i]) {
                maxCount++;
            }
        }

        if (min == max) {
            System.out.println("0 " + (1L * (n - 1) * n / 2));
        } else {
            System.out.println((max - min) + " " + (maxCount * minCount));
        }
    }
}