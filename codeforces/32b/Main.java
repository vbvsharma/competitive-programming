import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        StringBuilder ans = new StringBuilder();
        
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '.') {
                ans.append('0');
                i++;
            } else if (s.charAt(i) == '-' && s.charAt(i+1) == '.') {
                ans.append('1');
                i += 2;
            } else if (s.charAt(i) == '-' && s.charAt(i+1) == '-') {
                ans.append('2');
                i += 2;
            }
        }
        System.out.println(ans.toString());
        input.close();
    }
}