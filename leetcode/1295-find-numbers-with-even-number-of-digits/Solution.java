class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums)
            if (hasEvenNumberOfDigits(num))
                count++;
        
        return count;
    }
    
    private boolean hasEvenNumberOfDigits(int num) {
        int numOfDigits = 0;
        while (num > 0) {
            numOfDigits++;
            num = num / 10;
        }
        
        return numOfDigits % 2 == 0;
    }
}