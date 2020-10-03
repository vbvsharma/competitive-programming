import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();

        while (T-- > 0) {
            int G = input.nextInt();

            while (G-- > 0) {
                int I = input.nextInt();
                int N = input.nextInt();
                int Q = input.nextInt();

                if (I == Q)
                    System.out.println(N/2);
                else
                    System.out.println(N/2 + N%2);
            }
        }
        input.close();
    }
}