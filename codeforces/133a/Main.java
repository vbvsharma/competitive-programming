import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        input.close();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'H' || ch == 'Q' || ch == '9') {
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
    }
}