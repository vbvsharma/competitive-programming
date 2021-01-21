class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        
        if (nums == null || nums.length == 0)
            return subsets;
        
        Arrays.sort(nums);
        List<Integer> subset = new ArrayList<>();
        dfs(subsets, nums, subset, 0);
        return subsets;
    }
    
    private void dfs(List<List<Integer>> subsets, int[] nums, List<Integer> subset, int startIndex) {
        subsets.add(new ArrayList<>(subset));
        
        for (int i = startIndex; i < nums.length; i++) {
            if (i != startIndex && nums[i] == nums[i-1])
                continue;
            
            subset.add(nums[i]);
            dfs(subsets, nums, subset, i+1);
            subset.remove(subset.size() - 1);
        }
    }
}