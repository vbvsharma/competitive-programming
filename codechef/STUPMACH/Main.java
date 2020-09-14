import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T-- > 0) {
            int N = input.nextInt();

            int runningMin = Integer.MAX_VALUE;
            long total = 0;

            while (N-- > 0) {
                int S = input.nextInt();
                runningMin = Math.min(runningMin, S);

                total += runningMin;
            }

            System.out.println(total);
        }
        input.close();
    }
}