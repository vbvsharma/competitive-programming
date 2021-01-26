import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javafx.util.Pair;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int numBoys = input.nextInt();
            int numGirls = input.nextInt();
            int k = input.nextInt();
            
            int[] a = new int[numBoys];
            int[] b = new int[numGirls];
            int[][] edges = new int[k][2];
            for (int i = 0; i < k; i++) {
                edges[i][0] = input.nextInt() - 1;
                a[edges[i][0]]++;
            }

            for (int i = 0; i < k; i++) {
                edges[i][1] = input.nextInt() - 1;
                b[edges[i][1]]++;
            }
            
            long ans = 0;
            for (int[] edge : edges) {
                ans += k - (a[edge[0]] + b[edge[1]] - 1);
            }

            System.out.println(ans / 2);
        }
        input.close();
    }
}