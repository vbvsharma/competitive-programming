import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        input.nextLine();
        while (T-- > 0) {
            String s = input.nextLine();
            
            int longestLength = 0;
            int stack = 0;
            int i = 0;
            while (i < s.length() && stack >= 0) {
                if (s.charAt(i) == '<')
                    stack++;
                else
                    stack--;

                if (stack == 0)
                    longestLength = i+1;
                i++;
            }

            System.out.println(longestLength);
        }
        input.close();
    }
}