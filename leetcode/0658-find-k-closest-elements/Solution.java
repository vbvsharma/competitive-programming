class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n = arr.length;
        
        int lo = 0, hi = arr.length - k;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            
            if (x - arr[mid] > arr[mid + k] - x)
                lo = mid + 1;
            else
                hi = mid;
        }
        
        List<Integer> ans = new ArrayList<>(k);
        for (int i = lo; i < lo + k; i++)
            ans.add(arr[i]);
        
        return ans;
    }
}