class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0)
            return intervals;
        
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        
        int top = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= intervals[top][1]) {
                intervals[top][1] = Math.max(intervals[top][1], intervals[i][1]);
            } else {
                top++;
                intervals[top] = intervals[i];
            }
        }
        
        int[][] ans = new int[top+1][2];
        for (int i = 0; i <= top; i++) {
            ans[i] = intervals[i];
        }
        
        return ans;
    }
}