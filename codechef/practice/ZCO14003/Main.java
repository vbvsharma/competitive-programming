import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int[] budget = new int[N];
        for (int i = 0; i < N; i++)
            budget[i] = input.nextInt();
        
        Arrays.sort(budget);

        long maxRevenue = 0;
        for (int i = 0; i < N; i++) {
            long revenue = (long)(budget[i]) * (N - i);
            maxRevenue = Math.max(maxRevenue, revenue);
        }

        System.out.println(maxRevenue);

        input.close();
    }
}