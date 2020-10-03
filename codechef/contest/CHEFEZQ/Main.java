import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T-- > 0) {
            int n = input.nextInt();
            int k = input.nextInt();

            long sum = 0;

            long ans = -1;
            for (int day = 1; day <= n; day++) {
                sum += input.nextLong();
                if (ans != -1)  continue;
                if (sum < 1L * day * k) ans = day;
            }

            if (ans == -1) ans = sum / k + 1;
            System.out.println(ans);
        }
        input.close();
    }
}