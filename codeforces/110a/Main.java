import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long num = input.nextLong();
        input.close();

        if (isNearlyLucky(num))
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    private static boolean isNearlyLucky(long num) {
        int count = 0;

        while (num > 0) {
            if (num % 10 == 4 || num % 10 == 7)
                count++;
            num = num / 10;
        }

        if (count == 0)
            return false;

        while (count > 0) {
            if (count % 10 != 7 && count % 10 != 4)
                return false;
            count = count / 10;
        }

        return true;
    }
}