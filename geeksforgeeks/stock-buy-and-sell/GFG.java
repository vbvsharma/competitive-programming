import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());

            int[] A = new int[N];
            for (int i = 0; i < N; i++)
                A[i] = Integer.parseInt(st.nextToken());

            profit(A);
        }
        br.close();
    }

    private static void profit(int[] A) {
        boolean profit = false;

        int buyAt = 0;
        while (buyAt < A.length) {
            int sellAt = buyAt;
            while (sellAt + 1 < A.length && A[sellAt + 1] >= A[sellAt])
                sellAt++;

            if (buyAt != sellAt) {
                System.out.print("(" + buyAt + " " + sellAt + ") ");
                profit = true;
            }
            buyAt = sellAt + 1;
        }

        if (!profit)
            System.out.println("No Profit");
        else
            System.out.println();
    }
}