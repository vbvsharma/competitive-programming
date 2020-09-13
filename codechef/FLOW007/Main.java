import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int T = input.nextInt();
        while (T > 0) {
            int N = input.nextInt();

            System.out.println(reverse(N));

            T--;
        }
        input.close();
    }

    private static int reverse(int N) {
        int rev = 0;
        while (N > 0) {
            rev = rev * 10 + N % 10;
            N = N / 10;
        }

        return rev;
    }
}