class Solution {
    public boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    visited[i][j] = true;
                    if (search(board, i, j, 1, word.toCharArray(), visited))
                        return true;
                    visited[i][j] = false;
                }
            }
        }
        
        return false;
    }
    
    private boolean search(char[][] board, int row, int col, int idx, char[] word, boolean[][] visited) {
        if (idx == word.length)
            return true;
                    
        if (row-1 >= 0 && !visited[row-1][col] && board[row-1][col] == word[idx]) {
            visited[row - 1][col] = true;
            if (search(board, row-1, col, idx+1, word, visited))
                return true;
            visited[row - 1][col] = false;
        }
            
        if (row+1 < board.length && !visited[row+1][col] && board[row+1][col] == word[idx]) {
            visited[row + 1][col] = true;
            if (search(board, row + 1, col, idx+1, word, visited))
                return true;
            visited[row + 1][col] = false;
        }
            
        if (col-1 >= 0 && !visited[row][col-1] && board[row][col-1] == word[idx]) {
            visited[row][col-1] = true;
            if (search(board, row, col-1, idx+1, word, visited))
                return true;
            visited[row][col-1] = false;
        }
            
        if (col+1 < board[0].length && !visited[row][col+1] && board[row][col+1] == word[idx]) {
            visited[row][col+1] = true;
            if (search(board, row, col+1, idx+1, word, visited))
                return true;
            visited[row][col+1] = false;
        }
        
        return false;
    }
}