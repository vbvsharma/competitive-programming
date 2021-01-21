import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = input.nextInt();
        input.close();

        int minIdx = 0, count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] < a[minIdx]) {
                minIdx = i;
                count = 1;
            } else if (a[i] == a[minIdx]) {
                count++;
            }
        }

        if (count == 1)
            System.out.println(minIdx + 1);
        else
            System.out.println("Still Rozdil");
    }
}