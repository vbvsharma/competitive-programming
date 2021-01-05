import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuffer word = new StringBuffer(input.next());
        input.close();
        
        word.setCharAt(0, Character.toUpperCase(word.charAt(0)));

        System.out.println(word);
    }
}