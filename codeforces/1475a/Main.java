import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        
        while (t-- > 0) {
            long n = input.nextLong();

            if (hasOddDivisor(n))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        input.close();
    }

    private static boolean hasOddDivisor(long n) {
        long power2 = 2;
        while (power2 <= n) {
            if (n == power2)
                return false;
            power2 = power2 * 2;
        }

        return true;
    }
}