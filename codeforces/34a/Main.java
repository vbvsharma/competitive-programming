import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = input.nextInt();
        
        int minIndex = 0, min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (Math.abs(a[i] - a[(i + 1) % n]) < min) {
                minIndex = i;
                min = Math.abs(a[i] - a[(i + 1) % n]);
            }
        }

        System.out.println(minIndex + 1 + " " + ((minIndex + 1) % n + 1));
        input.close();
    }
}