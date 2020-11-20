import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sumX = 0, sumY = 0, sumZ = 0;
        for (int i = 0; i < n; i++) {
            sumX += input.nextInt();
            sumY += input.nextInt();
            sumZ += input.nextInt();
        }

        if (sumX == 0 && sumY == 0 && sumZ == 0)
            System.out.println("YES");
        else
            System.out.println("NO");

        input.close();
    }
}