import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        // Write your code here.
        s = removeLeadingNonLetters(s);
        
        if (s.length() == 0) {
            System.out.println(0);
            return;
        }

        String[] tokens = s.split("[\\s!,?._'@]+");
        System.out.println(tokens.length);
        for (String token: tokens) {
            System.out.println(token);
        }
        scan.close();
    }

    private static String removeLeadingNonLetters(String str) {
        int i;
        for (i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                break;
            }
        }
        return str.substring(i);
    }
}