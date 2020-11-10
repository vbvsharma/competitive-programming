class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Make a HashMap
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        
        // Make a Priority Queue
        Queue<Integer> heap = new PriorityQueue<>(
            (n1, n2) -> freq.get(n2) - freq.get(n1));
        
        for (int key : freq.keySet())
            heap.add(key);
        
        // Get top k frequent elements
        int[] top = new int[k];
        for (int i = 0; i < k; i++) {
            top[i] = heap.poll();
        }
        
        return top;
    }
}