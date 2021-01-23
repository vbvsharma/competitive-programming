import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        String s = input.next();
        input.close();

        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        boolean isPossible = true;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (freq[i] % k != 0) {
                isPossible = false;
                break;
            }

            if (freq[i] == 0)
                continue;

            for (int j = 0; j < freq[i] / k; j++)
                sb.append((char)('a' + i));
        }

        if (!isPossible)
            System.out.println(-1);
        
        while (isPossible && k-- > 0)
            System.out.print(sb.toString());
    }
}