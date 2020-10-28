class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        
        for (int sq = 0; sq <= n/2; sq++) {
            for (int startI = sq, startJ = sq; startJ < n-sq-1; startJ++) {
                int i = startI, j = startJ;
                int toMove = matrix[i][j];
                do {
                    int moveToI, moveToJ;
                    if (i == sq) {
                        moveToI = j;
                        moveToJ = n-1-sq;
                    } else if (i == n-1-sq) {
                        moveToI = j;
                        moveToJ = sq;
                    } else if (j == n-1-sq) {
                        moveToI = j;
                        moveToJ = n-1-i;
                    }  else {
                        moveToI = sq;
                        moveToJ = n-1-i;
                    }
                    
                    int temp = matrix[moveToI][moveToJ];
                    matrix[moveToI][moveToJ] = toMove;
                    toMove = temp;
                    i = moveToI;
                    j = moveToJ;
                } while (i != startI || j != startJ);
            }
        }
    }
}