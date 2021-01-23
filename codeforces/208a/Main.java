import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        input.close();

        String[] a = s.split("WUB");

        for (int i = 0; i < a.length; i++) {
            if (a[i].equals(""))
                continue;

            System.out.print(a[i] + " ");
        }
    }
}