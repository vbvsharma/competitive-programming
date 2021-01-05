import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int leftOpen = 0, rightOpen = 0;
        for (int i = 0; i < n; i++) {
            int l = input.nextInt();
            int r = input.nextInt();

            leftOpen += l;
            rightOpen += r;
        }

        input.close();

        System.out.println(Math.min(leftOpen, n - leftOpen)
                                + Math.min(rightOpen, n - rightOpen));
    }
}