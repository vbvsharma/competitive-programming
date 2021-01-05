import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.nextInt();
        String s = input.next();
        input.close();

        System.out.println(numOfCharToDelete(s));
    }

    private static int numOfCharToDelete(String s) {
        int count = 0;

        int start = 0;
        while (start < s.length()) {
            int next = start + 1;
            while (next < s.length() && s.charAt(start) == s.charAt(next))
                next++;
            count += next - start - 1;
            start = next;
        }
        return count;
    }
}