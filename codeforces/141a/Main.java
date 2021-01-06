import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String guest = input.next();
        String host = input.next();
        String letters = input.next();
        input.close();

        int[] freq = new int[26];
        for (int i = 0; i < guest.length(); i++) {
            char ch = guest.charAt(i);
            freq[ch - 'A']++;
        }

        for (int i = 0; i < host.length(); i++) {
            char ch = host.charAt(i);
            freq[ch - 'A']++;
        }

        for (int i = 0; i < letters.length(); i++) {
            char ch = letters.charAt(i);
            freq[ch - 'A']--;
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}