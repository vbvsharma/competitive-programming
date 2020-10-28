class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        if (nums1.length > nums2.length)    return intersect(nums2, nums1); 
        
        Map<Integer, Integer> occ = new HashMap<>();
        
        for (int n: nums1) {
            if (occ.containsKey(n))
                occ.put(n, occ.get(n)+1);
            else
                occ.put(n, 1);
        }
        
        int[] arr = new int[nums1.length];
        int sz = 0;
        for (int n: nums2) {
            if (occ.containsKey(n)) {
                Integer i = occ.get(n);
                if (i > 0) {
                    arr[sz++] = n;
                    occ.put(n, i-1);
                }
            }
        }
        
        return Arrays.copyOf(arr, sz);
    }
}