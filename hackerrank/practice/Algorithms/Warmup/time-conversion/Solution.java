// https://www.hackerrank.com/challenges/time-conversion/problem

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = input.next();

        input.close();

        System.out.println(timeConversion(s));
    }

    private static String timeConversion(String s) {
        String hourString = s.substring(0, 2);
        int hour = Integer.parseInt(hourString);

        if (s.endsWith("PM") && hour != 12) {
            return hour + 12 + s.substring(2, 8);
        } else if (s.endsWith("AM") && hour == 12) {
            return "00" + s.substring(2, 8);
        } else {
            return s.substring(0, 8);
        }
    }
}
