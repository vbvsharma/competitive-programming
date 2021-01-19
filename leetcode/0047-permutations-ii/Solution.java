class Solution {
    private List<List<Integer>> permutationList;
    private int length;
    public List<List<Integer>> permuteUnique(int[] nums) {
        permutationList = new ArrayList<>();
        
        if (nums.length == 0)
            return permutationList;
        
        length = nums.length;
        
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            int count = freq.getOrDefault(num, 0) + 1;
            freq.put(num, count);
        }
        
        List<Integer> permutation = new ArrayList<>();
        
        permuteUnique(permutation, 0, freq);

        return permutationList;
    }
    
    private void permuteUnique(List<Integer> permutation, int index, HashMap<Integer,
                               Integer> freq) {
        if (permutation.size() == length) {
            permutationList.add(new ArrayList<>(permutation));
            return;
        }
        
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == 0)
                continue;
            
            int num = entry.getKey();
            int count = entry.getValue();
            entry.setValue(count - 1);
            permutation.add(num);
            permuteUnique(permutation, index + 1, freq);
            permutation.remove(permutation.size() - 1);
            entry.setValue(count);
        }
    }
}