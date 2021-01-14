import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        while (t-- > 0) {
            int n = input.nextInt();
            int d = input.nextInt();

            int[] a = new int[n];
            boolean good = true;
            for (int i = 0; i < n; i++) {
                a[i] = input.nextInt();
                if (a[i] > d)
                    good = false;
            }
            
            int minSum = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++)
                for (int j = i + 1; j < n; j++)
                    if (a[i] + a[j] < minSum)
                        minSum = a[i] + a[j];
            
            if (minSum <= d || good)
                System.out.println("YES");
            else
                System.out.println("NO");
        }

        input.close();
    }
}