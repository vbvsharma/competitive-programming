import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count0 = 0, count5 = 0;
        
        while (n-- > 0) {
            if (input.nextInt() == 0)
                count0++;
            else
                count5++;
        }

        if (count5 >= 9 && count0 > 0) {
            for (int i = 0; i < count5 / 9; i++)
                System.out.print("555555555");
            while (count0-- > 0)
                System.out.print("0");
        } else if (count0 > 0) {
            System.out.println(0);
        } else {
            System.out.println(-1);
        }
        input.close();
    }
}