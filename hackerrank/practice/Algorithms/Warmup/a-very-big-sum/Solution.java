
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        long[] ar = new long[n];
        
        for (int i = 0; i < n; i++)
            ar[i] = input.nextLong();
        
        input.close();
        
        System.out.println(veryBigSum(ar));
    }

    private static long veryBigSum(long[] ar) {
        long sum = 0;
        
        for (int i = 0; i < ar.length; i++)
            sum += ar[i];
        
        return sum;
    }
}
