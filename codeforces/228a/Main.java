import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < 4; i++) {
            int s = input.nextInt();
            set.add(s);
        }
        input.close();

        System.out.println(4 - set.size());
    }
}