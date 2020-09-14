import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T-- > 0) {
            int N = input.nextInt();
            
            int count = 0;
            int speedOfCarAhead = Integer.MAX_VALUE;
            while (N-- > 0) {
                int maxSpeed = input.nextInt();

                if (speedOfCarAhead >= maxSpeed)
                    count++;
                
                speedOfCarAhead = Math.min(maxSpeed, speedOfCarAhead);
            }

            System.out.println(count);
        }
        input.close();
    }
}