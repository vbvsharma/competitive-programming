class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums)
            set.add(num);
        
        int count = 0;
        for (Integer num : set) {
            if (set.contains(num-1))
                continue;
            
            int i = num + 1;
            while(set.contains(i))
                i++;
            
            count = Math.max(count, i - num);
        }
        
        return count;
    }
}