import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        String t = input.next();

        if (isReverse(s, t))
            System.out.println("YES");
        else
            System.out.println("NO");

        input.close();
    }

    private static boolean isReverse(String s, String t) {
        if (s.length() != t.length())
            return false;
        
        int sIdx = 0, tIdx = t.length() - 1;
        while (sIdx < s.length()) {
            if (s.charAt(sIdx) != t.charAt(tIdx))
                return false;
            sIdx++;
            tIdx--;
        }

        return true;
    }
}