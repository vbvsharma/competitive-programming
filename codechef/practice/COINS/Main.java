import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    private static HashMap<Integer, Long> cache = new HashMap<>();

    public static void main(String[] args) {
        for (int i = 0; i <= 4; i++)
            cache.put(i, 0L + i);
        
        Scanner input = new Scanner(System.in);

        while (input.hasNextInt()) {
            int n = input.nextInt();

            System.out.println(calc(n));
        }
        input.close();
    }

    private static long calc(int n) {
        Long max_amt = cache.get(n);
        if (max_amt != null)
            return max_amt;
        
        long calc_2 = calc(n/2);
        long calc_3 = calc(n/3);
        long calc_4 = calc(n/4);
        max_amt = Math.max(0L + n, 0L + calc_2 + calc_3 + calc_4);
        cache.put(n, max_amt);
        return max_amt;
    }
}