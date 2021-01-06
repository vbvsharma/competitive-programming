import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int maxPeople = 0;
        int currPeople = 0;
        for (int i = 0; i < n; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            currPeople += b - a;
            if (maxPeople < currPeople)
                maxPeople = currPeople;
        }

        System.out.println(maxPeople);
    }
}