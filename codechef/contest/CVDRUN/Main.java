import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T-- > 0) {
            int N = input.nextInt();
            int K = input.nextInt();
            int X = input.nextInt();
            int Y = input.nextInt();

            boolean[] infected = new boolean[N];

            int currX = X;
            while (!infected[currX]) {
                infected[currX] = true;
                if (currX == Y) break;
                currX = (currX + K) % N;
            }

            if (infected[Y])
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        input.close();
    }
}