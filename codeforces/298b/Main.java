import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int sX = input.nextInt();
        int sY = input.nextInt();
        int eX = input.nextInt();
        int eY = input.nextInt();
        input.nextLine();
        String str = input.next();
        input.close();

        if (sX == eX && sY == eY) {
            System.out.println(0);
            return;
        }

        int ans = -1;
        for (int i = 0; i < t; i++) {
            char ch = str.charAt(i);
            if (ch == 'E' && sX < eX)
                sX++;
            else if (ch == 'S' && eY < sY)
                sY--;
            else if (ch == 'W' && eX < sX)
                sX--;
            else if (ch == 'N' && sY < eY)
                sY++;

            if (sX == eX && sY == eY) {
                ans = i + 1;
                break;
            }
        }

        System.out.println(ans);
    }
}