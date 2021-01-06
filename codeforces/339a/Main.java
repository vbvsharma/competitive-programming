import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        input.close();

        int count1 = 0, count2 = 0, count3 = 0;
        for (int i = 0; i < s.length(); i += 2) {
            char ch = s.charAt(i);
            if (ch == '1')  count1++;
            if (ch == '2')  count2++;
            if (ch == '3')  count3++;
        }

        if (count1 > 0) {
            System.out.print(1);
            count1--;
        } else if (count2 > 0) {
            System.out.print(2);
            count2--;
        } else if (count3 > 0) {
            System.out.print(3);
            count3--;
        }

        while (count1 > 0) {
            System.out.print("+1");
            count1--;
        }

        while (count2 > 0) {
            System.out.print("+2");
            count2--;
        }

        while (count3 > 0) {
            System.out.print("+3");
            count3--;
        }
    }
}