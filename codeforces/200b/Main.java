import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double total = 0;
        for (int i = 0; i < n; i++)
            total += input.nextInt();
        input.close();
        
        System.out.println(total / n);
    }
}