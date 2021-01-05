import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.next();
        String b = input.next();
        input.close();

        for (int i = 0; i < a.length(); i++)
            if (a.charAt(i) == b.charAt(i))
                System.out.print("0");
            else
                System.out.print("1");
        System.out.println();
    }
}