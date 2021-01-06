import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        while (n-- > 0) {
            String s = input.next();
            if (s.length() <= 10)
                System.out.println(s);
            else
                System.out.println(s.charAt(0) + "" + (s.length() - 2)
                                        + "" + s.charAt(s.length() - 1));
        }
        input.close();
    }
}