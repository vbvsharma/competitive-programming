import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[] a = new int[m];
        for (int i = 0; i < m; i++)
            a[i] = input.nextInt();
        
        input.close();
        
        Arrays.sort(a);

        int minCollection = 0, remainingPassengers = n;
        int i = 0;
        while (remainingPassengers > 0) {
            if (a[i] <= remainingPassengers)
                minCollection += a[i] * (a[i] + 1) / 2;
            else
                minCollection += a[i] * (a[i] + 1) / 2 - (a[i] - remainingPassengers) * (a[i] - remainingPassengers + 1) / 2;
            remainingPassengers = remainingPassengers - a[i];
            i++;
        }

        int maxCollection = 0;
        remainingPassengers = n;
        while (remainingPassengers-- > 0) {
            maxCollection += a[m - 1];
            a[m - 1]--;
            for (i = m - 2; i >= 0; i--) {
                if (a[i] > a[i+1]) {
                    int tmp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = tmp;
                } else {
                    break;
                }
            }
        }

        System.out.println(maxCollection + " " + minCollection);
    }
}