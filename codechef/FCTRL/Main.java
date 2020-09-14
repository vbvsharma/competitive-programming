import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int T = input.nextInt();
        while (T-- > 0) {
            int N = input.nextInt();

            System.out.println(zeros(N));
        }

        input.close();
    }

    private static int zeros(int n) {
        int fivePowers = 5;
        int zerosCount = 0;

        while (n / fivePowers > 0) {
            zerosCount += n / fivePowers;
            fivePowers *= 5;
        }

        return zerosCount;
    }
}