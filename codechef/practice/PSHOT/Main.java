import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T-- > 0) {
            int N = input.nextInt();
            input.nextLine();
            String S = input.nextLine();
            
            System.out.println(pshot(S, N));
        }
        input.close();
    }

    private static int pshot(String S, int N) {
        int A = 0, B = 0;
        for (int i = 0; i < 2*N; i++) {
            if (i % 2 == 0) {   // A's turn
                A += S.charAt(i) == '1' ? 1 : 0;
            } else {            // B's turn
                B += S.charAt(i) == '1' ? 1 : 0;
            }

            // Chances left
            int leftA = N - (i / 2) - 1;
            int leftB = N - (i / 2) - (i % 2);

            if (A > B + leftB || B > A + leftA)
                return i+1;
        }

        return 2*N;
    }
}