import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int x = input.nextInt();
                if (x == 1) {
                    System.out.println(Math.abs(2 - i) + Math.abs(2 - j));
                    break;
                }
            }
        }

        input.close();
    }
}