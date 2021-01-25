import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();

            int i = 0;
            boolean canBeDone = false;
            while (i * 2020 <= n) {
                int rem = n - i * 2020;
                if (rem % 2021 == 0) {
                    canBeDone = true;
                }
                i++;
            }

            if (canBeDone)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        input.close();
    }
}