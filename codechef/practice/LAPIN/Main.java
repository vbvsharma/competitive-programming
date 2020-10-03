import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int T = input.nextInt();
        
        input.nextLine();

        while (T-- > 0) {
            String str = input.nextLine();

            if (isLapindrome(str)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        input.close();
    }

    private static boolean isLapindrome(String s) {
        int[] freq = new int[26];

        int len = s.length();

        for (int i = 0; i < len/2; i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }

        int start = len / 2 + len % 2;
        for (int i = start; i < len; i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']--;

            if (freq[ch - 'a'] < 0)
                return false;
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0)
                return false;
        }

        return true;
    }
}