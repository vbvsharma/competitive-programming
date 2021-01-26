class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {        
        for (int num : nums) {
            int index = Math.abs(num) - 1;
            
            if (0 < nums[index])
                nums[index] = -nums[index];
        }
        
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (0 < nums[i])
                ans.add(i + 1);
        }
        
        return ans;
    }
}