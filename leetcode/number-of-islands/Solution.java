class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length, n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        
        int numOfIslands = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j] && grid[i][j] == '1') {
                    bfs(i, j, visited, grid);
                    numOfIslands++;
                }
            }
        }
        
        return numOfIslands;
    }
    
    private class Cell {
        int row, col;
        Cell(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }
    
    private void bfs(int startI, int startJ, boolean[][] visited, char[][] grid) {  
        int m = grid.length, n = grid[0].length;
        Queue<Cell> q = new LinkedList<>();
        q.add(new Cell(startI, startJ));
        visited[startI][startJ] = true;
        
        while (!q.isEmpty()) {
            Cell currCell = q.poll();
            int r = currCell.row;
            int c = currCell.col;
            
            if (r+1 < m && grid[r+1][c] == '1' && !visited[r+1][c]) {
                q.add(new Cell(r+1, c));
                visited[r+1][c] = true;
            }
            if (r-1 >= 0 && grid[r-1][c] == '1' && !visited[r-1][c]) {
                q.add(new Cell(r-1, c));
                visited[r-1][c] = true;
            }
            if (c+1 < n && grid[r][c+1] == '1' && !visited[r][c+1]) {
                q.add(new Cell(r, c+1));
                visited[r][c+1] = true;
            }
            if (c-1 >= 0 && grid[r][c-1] == '1' && !visited[r][c-1]) {
                q.add(new Cell(r, c-1));
                visited[r][c-1] = true;
            }
        }
    }
}