import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        int[] a = new int[12];
        for (int i = 0; i < 12; i++)
            a[i] = input.nextInt();
        
        input.close();

        Arrays.sort(a);

        int index = 12;
        int sum = 0;
        while (sum < k && 0 <= index - 1) {
            sum += a[--index];
        }

        System.out.println(sum < k ? -1 : 12 - index);
    }
}