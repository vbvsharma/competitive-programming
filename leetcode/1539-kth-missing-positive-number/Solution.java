class Solution {
    public int findKthPositive(int[] arr, int k) {
        int prevAns = 0, ans = 1, countMissing = 0, i = 0;
        
        while (countMissing < k) {
            if (i < arr.length && ans == arr[i]) {
                i++;
                ans++;
            } else if (arr.length == i || (i < arr.length && ans < arr[i])) {
                prevAns = ans;
                ans++;
                countMissing++;
            }
        }
        
        return prevAns;
    }
}