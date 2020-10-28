class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        
        for (int i = 0; i < nums.length; i++) {
            Integer prevI = map.get(target-nums[i]);
            if (prevI != null) {
                ans[0] = prevI;
                ans[1] = i;
                
                break;
            }
            
            map.put(nums[i], i);
        }
        
        return ans;
    }
}