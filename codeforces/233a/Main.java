import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        findPermutation(n);
    }

    private static void findPermutation(int n) {
        if (n % 2 == 1) {
            System.out.println(-1);
            return;
        }

        for (int i = 1; i <= n; i++)
            System.out.print((i % 2 == 0 ? i - 1 : i + 1) + " ");
        System.out .println();
    }
}