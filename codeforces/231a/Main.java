import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int tmp = 0;
            for (int j = 0; j < 3; j++)
                tmp += input.nextInt();
            if (tmp > 1)
                count++;
        }

        System.out.println(count);
        input.close();
    }
}