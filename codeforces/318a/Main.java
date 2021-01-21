import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        long k = input.nextLong();
        input.close();
        
        long numOdds = (n + 1) / 2;
        if (k <= numOdds)
            System.out.println(2 * k - 1);
        else
            System.out.println(2 * (k - numOdds));
    }
}