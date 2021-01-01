import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();

        while (T-- > 0) {
            long k = input.nextLong();
            int d0 = input.nextInt();
            int d1 = input.nextInt();

            if (sumOfDigits(k, d0, d1) % 3 == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }

        input.close();
    }

    private static long sumOfDigits(long k, int d0, int d1) {
        long sum = d0 + d1;
        int[] last4 = new int[4];
        k = k - 2;

        for (int i = 0; i < 4 && 0 < k; i++, k--) {
            if (i == 0) {
                last4[i] = (d0 + d1) % 10;
            } else {
                last4[i] = (last4[i-1] * 2) % 10;
            }

            sum = sum + last4[i];
        }

        if (k == 0)
            return sum;

        int lastDigit = last4[3];
        
        while (k > 0) {
            lastDigit = (lastDigit * 2) % 10;

            if (last4[0] == lastDigit) {    // is present in last4
                long q = k / 4;
                long r = k % 4;

                long sumOf4 = 0;
                for (int n : last4)
                    sumOf4 += n;
                
                sum = sum + sumOf4 * q;

                for (int i = 0; i < r; i++)
                    sum = sum + last4[i];
                
                return sum;
            }

            for (int i = 1; i < 4; i++)
                last4[i-1] = last4[i];
            last4[3] = lastDigit;
            sum = sum + lastDigit;
            k--;
        }

        return sum;
    }

    private static boolean isPresent(int[] last4, int x) {
        for (int n : last4)
            if (n == x)
                return true;
        return false;
    }
}