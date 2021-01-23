import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = input.nextInt();
        
        int m = input.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++)
            b[i] = input.nextInt();
        
        input.close();
        
        int max = 0, maxCount = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (b[j] % a[i] != 0)
                    continue;

                if (max == b[j] / a[i]) {
                    maxCount++;                    
                } else if (max < b[j] / a[i]) {
                    max = b[j] / a[i];
                    maxCount = 1;
                }
            }
        }

        System.out.println(maxCount);
    }
}