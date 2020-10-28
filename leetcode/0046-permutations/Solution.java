class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> numsList = new ArrayList<>(nums.length);
        for (int num : nums)
            numsList.add(num);
        
        permute(0, ans, numsList);
        return ans;
    }
    
    private void permute(int idx, List<List<Integer>> ans, ArrayList<Integer> nums) {
        if (idx == nums.size()) {
            ans.add(new ArrayList<>(nums));
            return;
        }
        
        for (int jdx = idx; jdx < nums.size(); jdx++) {
            int temp = nums.get(idx);
            nums.set(idx, nums.get(jdx));
            nums.set(jdx, temp);
            ArrayList<Integer> numsCopy = new ArrayList<>(nums);
            permute(idx + 1, ans, numsCopy);
        }
    }
}