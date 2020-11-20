import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int t = input.nextInt();
        String s = input.next();
        char[] q = s.toCharArray();

        while (t-- > 0) {
            for (int i = 0; i < n-1; i++) {
                if (q[i] == 'B' && q[i+1] == 'G') {
                    q[i] = 'G';
                    q[i+1] = 'B';
                    i++;
                }
            }
        }

        System.out.println(new String(q));

        input.close();
    }
}