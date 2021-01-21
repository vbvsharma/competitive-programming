class Solution {
    List<List<Integer>> subsets;
    
    public List<List<Integer>> subsets(int[] nums) {
        subsets = new ArrayList<>();
        subsets(nums, new ArrayList<>(), 0);
        return subsets;
    }
    
    private void subsets(int[] nums, List<Integer> subset, int start) {
        subsets.add(new ArrayList<>(subset));
       
        for (int i = start; i < nums.length; ++i) {
            subset.add(nums[i]);
            subsets(nums, subset, i + 1);
            subset.remove(subset.size() - 1);
        }
    }
}