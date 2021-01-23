class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                int aliveNeighbors = 0;
                int[] deltaRowArr = {0, 1, -1};
                int[] deltaColArr = {0, 1, -1};
                
                for (int dR : deltaRowArr) {
                    for (int dC : deltaColArr) {
                        if (dR == 0 && dC == 0)
                            continue;
                        
                        int r = row + dR;
                        int c = col + dC;
                        
                        if (0 <= r && r < m && 0 <= c && c < n && board[r][c] % 2 == 1)
                            aliveNeighbors++;
                    }
                }
                
                if (board[row][col] == 1 && aliveNeighbors < 2)
                    board[row][col] += 0;
                else if (board[row][col] == 1 && aliveNeighbors <= 3)
                    board[row][col] += 2;
                else if (board[row][col] == 1 && 3 < aliveNeighbors)
                    board[row][col] += 0;
                else if (board[row][col] == 0 && aliveNeighbors == 3)
                    board[row][col] += 2;
            }
        }
        
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                board[i][j] = board[i][j] / 2;
    }
}