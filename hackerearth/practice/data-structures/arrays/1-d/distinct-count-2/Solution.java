// https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/golf/distinct-count-2/

import java.util.*;

class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        HashMap<Integer, Integer> freq = new HashMap<>();

        int ans = 0, ansFreq = 0;
        for (int i = 0; i < N; i++) {
            int x = input.nextInt();

            int count = freq.getOrDefault(x, 0) + 1;
            freq.put(x, count);
            if (ansFreq < count) {
                ans = x;
                ansFreq = count;
            } else if (ansFreq == count && x < ans) {
                ans = x;
            }
        }

        input.close();

        System.out.println(ans);
    }
}
