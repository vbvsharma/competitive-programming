class Solution {
    int[] kLargest(int[] arr, int n, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(n, new Compare());
	    for (int i = 0; i < n; i++) {
	        pq.add(arr[i]);
	    }
	    
	    int[] result = new int[k];
	    for (int i = 0; i < k; i++) {
	        result[i] = pq.peek();
	        pq.remove();
	    }
	    
	    return result;
    }
}

class Compare implements Comparator<Integer> {
    public int compare(Integer a, Integer b) {
        if (Integer.valueOf(a) < Integer.valueOf(b))
            return 1;
        if (Integer.valueOf(a) > Integer.valueOf(b))
            return -1;
        return 0;
    }
}