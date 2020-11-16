class Solution {
    private Index[] memo;
    public boolean canJump(int[] nums) {
        memo = new Index[nums.length];
        for (int i = 0; i < memo.length; i++)
            memo[i] = Index.UNKNOWN;
        
        memo[memo.length-1] = Index.GOOD;
        
        return canJumpFromPosition(0, nums);
    }
    
    private boolean canJumpFromPosition(int position, int[] nums) {
        if (memo[position] == Index.GOOD)
            return true;
        if (memo[position] == Index.BAD)
            return false;
        
        int furthestJump = Math.min(position + nums[position], nums.length-1);
        for (int nextPosition = furthestJump; nextPosition > position; nextPosition--) {
            if (canJumpFromPosition(nextPosition, nums)) {
                memo[position] = Index.GOOD;
                return true;
            }
        }
        
        memo[position] = Index.BAD;
        return false;
    }
}

enum Index {
    GOOD, BAD, UNKNOWN
}