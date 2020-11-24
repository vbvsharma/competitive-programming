class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int i = 0;
        while (i < nums.length) {
            int j = i;
            while (j < nums.length && nums[j] == 1)
                j++;
            
            if (max < j - i)
                max = j - i;
            
            i = j + 1;
        }
        
        return max;
    }
}