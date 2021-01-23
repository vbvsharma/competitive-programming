import java.util.Scanner;

public class Main {
    static int n;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        input.close();
        print();
    }

    private static void print() {
        for (int i = 0; i <= n; i++) {
            int sp = 2 * (n - i);
            while (sp-- > 0)
                System.out.print(" ");
            
            print(0, i);
            System.out.println();
        }

        for (int i = n-1; i >= 0; i--) {
            int sp = 2 * (n - i);
            while (sp-- > 0)
                System.out.print(" ");
            
            print(0, i);
            System.out.println();
        }
    }

    private static void print(int i, int n) {
        System.out.print(i);
        if (i == n)
            return;
        System.out.print(" ");
        print(i+1, n);
        System.out.print(" ");
        System.out.print(i);
    }
}