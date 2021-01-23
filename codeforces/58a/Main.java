import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        input.close();

        boolean saidHello = true;
        String hello = "hello";
        int startFrom = 0;
        for (int i = 0; i < 5; i++) {
            int foundAt = s.indexOf(hello.charAt(i), startFrom);

            if (foundAt == -1) {
                saidHello = false;
                break;
            }

            startFrom = foundAt + 1;
        }

        if (saidHello)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}