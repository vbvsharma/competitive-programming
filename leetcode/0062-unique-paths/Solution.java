class Solution {
    public int uniquePaths(int m, int n) {
        long count = 1;
        m = m - 1;
        n = n - 1;
        for (int i = m + 1; i <= m + n; i++)
            count = count * i / (i - m);
        return (int)count;
    }
}