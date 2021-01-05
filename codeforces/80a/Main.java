import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        input.close();

        if (isNextPrime(n, m))
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    private static boolean isNextPrime(int n, int m) {
        for (int i = n+1; i <= m; i++) {
            if (isPrime(i)){
                return i == m;
            }
        }

        return false;
    }

    private static boolean isPrime(int x) {
        if (x == 1)
            return false;
        
        for (int i = 2; i <= Math.sqrt(x); i++)
            if (x % i == 0)
                return false;
        
        return true;
    }
}