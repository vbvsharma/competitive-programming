class Solution {
    private int[] originalNums;
    private int[] nums;
    
    public Solution(int[] nums) {
        originalNums = Arrays.copyOfRange(nums, 0, nums.length);
        this.nums = nums;
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        nums = Arrays.copyOfRange(originalNums, 0, originalNums.length);
        return nums;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            int idx = random.nextInt(nums.length);
            int tmp = nums[i];
            nums[i] = nums[idx];
            nums[idx] = tmp;
        }
        
        return nums;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */