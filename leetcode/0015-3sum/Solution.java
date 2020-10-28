class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        
        List<List<Integer>> ans = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i >= 1 && nums[i] == nums[i-1])
                continue;
        
            int l = i+1, r = nums.length-1;
            
            while (l < r) {
                if (nums[l] + nums[r] == -nums[i]) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    
                    ans.add(list);
                    l++;
                    r--;
                    
                    while (l < r && nums[l] == nums[l-1])   l++;
                    while (l < r && nums[r] == nums[r+1])   r--;
                } else if (nums[l] + nums[r] < -nums[i]) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        
        return ans;
    }
}