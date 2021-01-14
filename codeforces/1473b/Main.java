import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int q = input.nextInt();

        while (q-- > 0) {
            String s = input.next();
            String t = input.next();

            System.out.println(findStringLCM(s, t));
        }

        input.close();
    }

    private static String findStringLCM(String s, String t) {
        if (s.length() < t.length())
            return findStringLCM(t, s);
        
        int lcm = s.length() * t.length() / hcf(s.length(), t.length());

        StringBuilder ans = new StringBuilder();
        int i = 0;
        while (i < lcm) {
            if (s.charAt(i % s.length()) != t.charAt(i % t.length()))
                return "-1";
            ans.append(s.charAt(i % s.length()));
            i++;
        }

        return ans.toString();
    }

    private static int hcf(int a, int b) {
        if (a < b)
            return hcf(b, a);
        
        if (b == 0)
            return a;
        
        return hcf(b, a % b);
    }
}