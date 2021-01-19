import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; ++i) {
            x[i] = input.nextInt();
            y[i] = input.nextInt();
        }

        input.close();

        int count = 0;
        for (int i = 0; i < n; ++i) {
            boolean left = false, right = false, up = false, down = false;
            for (int j = 0; j < n; ++j) {
                right = right || (x[i] < x[j] && y[i] == y[j]);
                left = left || (x[j] < x[i] && y[i] == y[j]);
                up = up || (y[i] < y[j] && x[i] == x[j]);
                down = down || (y[j] < y[i] && x[i] == x[j]);
            }

            if (left && right && up && down)
                ++count;
        }
        
        System.out.println(count);
    }
}