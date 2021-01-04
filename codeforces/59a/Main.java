import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next();
        input.close();

        int lowerCount = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isLowerCase(word.charAt(i)))
                lowerCount++;
        }
        int upperCount = word.length() - lowerCount;

        if (upperCount > lowerCount)
            System.out.println(word.toUpperCase());
        else
            System.out.println(word.toLowerCase());
    }
}