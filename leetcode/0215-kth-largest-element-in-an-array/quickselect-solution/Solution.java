class Solution {
    private int[] nums;
    
    public int findKthLargest(int[] nums, int k) {
        this.nums = nums;
        quickselect(0, nums.length-1, k-1);
        return nums[k-1];
    }
    
    private void quickselect(int left, int right, int k_largest) {
        if (left == right)
            return;
        
        Random random_num = new Random();
        int pivot_idx = random_num.nextInt(right - left) + left;
        
        pivot_idx = partition(left, right, pivot_idx);
        
        if (pivot_idx == k_largest) {
            return;
        } else if (k_largest < pivot_idx) {
            quickselect(left, pivot_idx - 1, k_largest);
        } else {
            quickselect(pivot_idx + 1, right, k_largest);
        }
    }
    
    private void swap(int idx1, int idx2) {
        int tmp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = tmp;
    }
    
    private int partition(int left, int right, int pivot_idx) {
        swap(pivot_idx, right);
        
        pivot_idx = right;
        
        int store_idx = left;
        for (int i = left; i <= right; i++) {
            if (nums[i] > nums[pivot_idx]) {
                swap(i, store_idx);
                store_idx++;
            }
        }
        
        swap(store_idx, pivot_idx);
        
        return store_idx;
    }
}