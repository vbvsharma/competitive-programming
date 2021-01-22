import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String n = input.next();
        input.close();

        System.out.println(isMagicNumber(n));
    }

    private static String isMagicNumber(String n) {
        if (n.startsWith("4") || n.contains("444"))
            return "NO";
        
        for (int i = 0; i < n.length(); i++)
            if (n.charAt(i) != '1' && n.charAt(i) != '4')
                return "NO";

        return "YES";
    }
}