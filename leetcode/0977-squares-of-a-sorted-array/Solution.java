class Solution {
    public int[] sortedSquares(int[] A) {
        int[] squares = new int[A.length];
        int k = squares.length - 1;
        
        int left = 0, right = A.length - 1;
        while (left <= right) {
            if (A[left] * A[left] < A[right] * A[right]) {
                squares[k--] = A[right] * A[right];
                right--;
            } else {
                squares[k--] = A[left] * A[left];
                left++;
            }
        }
        
        return squares;
    }
}