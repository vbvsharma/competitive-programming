import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();

        int max = 0, maxIndex = -1;
        for (int i = 0; i < n; i++) {
            int a = input.nextInt();
            a = (a + m - 1) / m;
            if (max <= a) {
                max = a;
                maxIndex = i + 1;
            }
        }
        input.close();
        System.out.println(maxIndex);
    }
}