import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] map = new int[100001];
        for (int i = 1; i <= n; i++) {
            int x = input.nextInt();
            map[x] = i;
        }

        int m = input.nextInt();
        int left = 0, right = 0;
        while (0 < m--) {
            int b = input.nextInt();
            left += map[b];
            right += n - map[b] + 1;
        }
        input.close();

        System.out.println(left + " " + right);
    }
}