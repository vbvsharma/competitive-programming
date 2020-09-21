import java.util.Scanner;

public class SimpleArraySum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++)     ar[i] = input.nextInt();

        input.close();

        System.out.println(simpleArraySum(ar));
    }

    private static int simpleArraySum(int[] ar) {
        int sum = 0;

        for (int i = 0; i < ar.length; i++)
            sum += ar[i];

        return sum;
    }
}
