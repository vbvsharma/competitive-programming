class Solution {
    public int findKthLargest(int[] nums, int k) {
        // 1. Make a heap, top element is smallest in heap
        Queue<Integer> heap = new PriorityQueue<>(
                (n1, n2) -> n1 - n2);
        
        // 2. Iteratively add elements, keeping the size of the heap <= k
        for (int num : nums) {
            heap.add(num);
            if (heap.size() > k)
                heap.poll();
        }
        
        // 3. If heap size is k, top most element is the answer
        return heap.poll();
    }
}