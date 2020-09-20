import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int Q = input.nextInt();

        List<List<Integer>> seqList = new ArrayList<List<Integer>>();
        for (int i = 0; i < N; i++) {
            seqList.add(new ArrayList<>());
        }

        int lastAnswer = 0;

        while (Q-- > 0) {
            int q = input.nextInt();
            int x = input.nextInt();
            int y = input.nextInt();

            if (q == 1) {
                seqList.get((x ^ lastAnswer) % N).add(y);
            } else if (q == 2) {
                lastAnswer = seqList.get((x ^ lastAnswer) % N).get(y % seqList.get((x ^ lastAnswer) % N).size());
                System.out.println(lastAnswer);
            }
        }

        input.close();
    }
}
