import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T-- > 0) {
            int N = input.nextInt();

            int maxProfit = 0;
            for (int i = 0; i < N; i++) {
                int S = input.nextInt();
                int P = input.nextInt();
                int V = input.nextInt();

                int profit = P / (S+1) * V;

                maxProfit = Math.max(maxProfit, profit);
            }

            System.out.println(maxProfit);
        }
        input.close();
    }
}