import java.util.Scanner;

public class SolveMeFirst {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        input.close();

        System.out.println(solveMeFirst(a, b));
    }

    private static int solveMeFirst(int a, int b) {
        return a + b;
    }
}
