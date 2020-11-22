class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        HashMap<Integer, Integer> sumAB = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                int freq = sumAB.getOrDefault(A[i] + B[j], 0);
                sumAB.put(A[i] + B[j], freq + 1);
            }
        }
        
        int count = 0;
        HashMap<Integer, Integer> sumCD = new HashMap<>();
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < D.length; j++) {
                int sum = C[i] + D[j];
                count += sumAB.getOrDefault(-sum, 0);
            }
        }
        
        return count;
    }
}