import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s = input.nextInt();
        int n = input.nextInt();
        Pair[] pair = new Pair[n];
        for (int i = 0; i < n; i++) {
            int x = input.nextInt();
            int y = input.nextInt();
            pair[i] = new Pair(x, y);
        }
        input.close();

        Arrays.sort(pair, (a, b) -> a.x - b.x);
        
        
        boolean canReachNextLevel = true;
        for (int i = 0; i < n; i++) {
            if (s <= pair[i].x) {
                canReachNextLevel = false;
                break;
            }

            s = s + pair[i].y;
        }

        if (canReachNextLevel)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}

class Pair {
    int x, y;
    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}