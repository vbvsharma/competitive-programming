class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int top = 0, bottom = matrix.length-1;
        if (bottom == -1)
            return false;
        int left = 0, right = matrix[0].length-1;
        if (right == -1)
            return false;
        
        if(target < matrix[top][left] || matrix[bottom][right] < target)
            return false;
        
        return searchMatrix(matrix, top, bottom, left, right, target);
    }
    
    private boolean searchMatrix(int[][] matrix, int top, int bottom, int left, int right, int target) {
        if (top > bottom || left > right)
            return false;
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        int midRow = (top + bottom) / 2;
        int midCol = (left + right) / 2;
        
        if (matrix[midRow][midCol] == target)
            return true;
        
        if (target < matrix[midRow][midCol])
            return searchMatrix(matrix, top, midRow-1, left, right, target) || 
                   searchMatrix(matrix, midRow, bottom, left, midCol-1, target);
        return searchMatrix(matrix, top, midRow, midCol+1, right, target) ||
            searchMatrix(matrix, midRow+1, bottom, left, right, target);
    }
}