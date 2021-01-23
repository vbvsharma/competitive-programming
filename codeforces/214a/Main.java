import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        input.close();

        int count = 0;
        for (int a = 0; a <= 32; a++) {
            for (int b = 0; b <= 32; b++) {
                if (a*a + b == n && a + b * b == m)
                    count++;
            }
        }

        System.out.println(count);
    }
}