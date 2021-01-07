import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int ans = 0;
        while (n-- > 0) {
            String x = input.next();

            if (x.equals("++X") || x.equals("X++"))
                ++ans;
            else
                --ans;
        }

        System.out.println(ans);
        input.close();
    }
}