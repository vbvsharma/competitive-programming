class Solution {
    public void setZeroes(int[][] matrix) {
        boolean setFirstRowToZero = false;
        int nRow = matrix.length;
        
        if (nRow == 0)
            return; 
        
        int nCol = matrix[0].length;
        
        for (int i = 0; i < nRow; i++) {
            for (int j = 0; j < nCol; j++) {
                if (matrix[i][j] != 0)
                    continue;
                
                if (i == 0) {
                    setFirstRowToZero = true;
                    continue;
                }
                
                matrix[i][0] = 0;
                matrix[0][j] = 0;
            }
        }
        
        for (int col = 1; col < nCol; col++) {
            if (matrix[0][col] == 0) {
                for (int row = 1; row < nRow; row++)
                    matrix[row][col] = 0;
            }
        }
        
        for (int row = 1; row < nRow; row++) {
            if (matrix[row][0] == 0) {
                for (int col = 1; col < nCol; col++)
                    matrix[row][col] = 0;
            }
        }
        
        if (matrix[0][0] == 0) {
            for (int row = 0; row < nRow; row++)
                matrix[row][0] = 0;
        }
        
        if (setFirstRowToZero) {
            for (int col = 0; col < nCol; col++)
                matrix[0][col] = 0;
        }
    }
}