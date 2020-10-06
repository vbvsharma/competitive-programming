import java.util.Scanner;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T-- > 0) {
            int n = input.nextInt();
            int k = input.nextInt();

            System.out.println(C(n, k));
        }
        input.close();
    }

    private static long C(int n, int k) {
        long res = 1L;
        for (int i = 1; i < k; i++) {
            res *= (long)(n-k+i);
            res /= (long)i;
        }
        
        return res;
    }
}