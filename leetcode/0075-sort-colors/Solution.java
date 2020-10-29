class Solution {
    public void sortColors(int[] nums) {
        int idx_0 = 0, idx_2 = nums.length-1;
        int i = 0;
        while (i <= idx_2) {
            if (nums[i] == 0) {
                nums[i] = nums[idx_0];
                nums[idx_0] = 0;
                idx_0++;
                i++;
            } else if (nums[i] == 2) {
                nums[i] = nums[idx_2];
                nums[idx_2] = 2;
                idx_2--;
            } else {
                i++;
            }
            
            for (int j = 0; j < nums.length; j++)
                System.out.print(nums[j] + " ");
            System.out.println();
        }
    }
}
// Dutch National Flag Algorithm