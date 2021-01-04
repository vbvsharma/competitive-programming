import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        input.close();

        int candidateYear = year + 1;
        while (!isDistinct(candidateYear))
            candidateYear++;
        
        System.out.println(candidateYear);
    }

    private static boolean isDistinct(int year) {
        HashSet<Integer> set = new HashSet<>();
        while (year > 0) {
            set.add(year % 10);
            year = year / 10;
        }

        return set.size() == 4;
    }
}