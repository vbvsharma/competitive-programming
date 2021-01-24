import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        PriorityQueue<Integer> pqMin = new PriorityQueue<>(n, (x, y) -> x - y);
        PriorityQueue<Integer> pqMax = new PriorityQueue<>(n, (x, y) -> y - x);

        for (int i = 0; i < m; i++) {
            int a = input.nextInt();
            pqMin.add(a);
            pqMax.add(a);
        }

        input.close();

        

        int min = 0;
        int remainingPassengers = n;
        while (remainingPassengers-- > 0) {
            int x = pqMin.poll();
            min += x;
            if (1 < x)  pqMin.add(x - 1);
        }

        int max = 0;
        while (n-- > 0) {
            int x = pqMax.poll();
            max += x;
            pqMax.add(x-1);
        }

        System.out.println(max + " " + min);
    }
}