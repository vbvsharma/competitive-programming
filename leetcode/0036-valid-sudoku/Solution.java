class Solution {
    public boolean isValidSudoku(char[][] board) {
        return validRowsAndCols(board) && validBlocks(board);
    }
    
    private boolean validRowsAndCols(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            Set<Character> digitsRow = new HashSet<>();
            Set<Character> digitsCol = new HashSet<>();
            
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != '.') {
                    if (digitsRow.contains(board[i][j]))
                        return false;
                    digitsRow.add(board[i][j]);
                }
                
                if (board[j][i] != '.') {
                    if (digitsCol.contains(board[j][i]))
                        return false;
                    digitsCol.add(board[j][i]);
                }
            }
        }
        
        return true;
    }
    
    private boolean validBlocks(char[][] board) {
        for (int startRow = 0; startRow < board.length; startRow += 3) {
            for (int startCol = 0; startCol < board.length; startCol += 3) {
                Set<Character> digits = new HashSet<>();
                for (int i = startRow; i < startRow+3; i++) {
                    for (int j = startCol; j < startCol+3; j++) {
                        if (board[i][j] == '.')
                            continue;
                        if (digits.contains(board[i][j]))
                            return false;
                        digits.add(board[i][j]);
                    }
                }
            }
        }
        
        return true;
    }
}