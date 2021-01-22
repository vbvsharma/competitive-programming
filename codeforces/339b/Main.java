import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        
        int lastPosition = 1;
        long timeTaken = 0;
        while (m-- > 0) {
            int a = input.nextInt();

            if (lastPosition < a) {
                timeTaken += a - lastPosition;
            } else if (a < lastPosition) {
                timeTaken += n - (lastPosition - a);
            }

            lastPosition = a;
        }

        System.out.println(timeTaken);
        
        input.close();
    }
}