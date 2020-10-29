class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsetList = new LinkedList<>();
        int len = nums.length;
        for (int bitmask = 0; bitmask < (int)Math.pow(2, len); bitmask++) {
            ArrayList<Integer> subset = new ArrayList<>();
            for (int shift = 0; shift < len; shift++) {
                int shifted = bitmask >>> shift;
                if ((shifted & 1) == 1) {
                    subset.add(nums[shift]);
                }
            }
            subsetList.add(subset);
        }
        return subsetList;
    }
}