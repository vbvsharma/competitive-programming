import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        while (input.hasNext()) {
            n = input.nextInt();

            if (n == 42)
                break;
            
            System.out.println(n);
        }

        input.close();
    }
}