import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        input.close();

        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++)
            set.add(s.charAt(i));

        if (set.size() % 2 == 1) {
            System.out.println("IGNORE HIM!");
        } else {
            System.out.println("CHAT WITH HER!");
        }
    }
}