import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        System.out.print(n);
        for (int i = 1; i < n; i++)
            System.out.print(" " + i);
    }
}