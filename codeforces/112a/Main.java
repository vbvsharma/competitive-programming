import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1 = input.next().toLowerCase();
        String s2 = input.next().toLowerCase();
        input.close();
        if (s1.compareTo(s2) == 0)
            System.out.println(0);
        else
            System.out.println(s1.compareTo(s2) < 0 ? -1 : 1);
    }
}