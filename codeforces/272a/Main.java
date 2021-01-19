import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int totalFingers = 0;
        for (int i = 0; i < n; ++i)
            totalFingers += input.nextInt();
        
        int count = 0;
        for (int i = 1; i <= 5; i++) {
            if ((totalFingers + i) % (n + 1) != 1)
                count++;
        }

        input.close();
        System.out.println(count);
    }
}