class Solution {
public:
    bool isValidSudoku(vector<vector<char>>& board) {
        set<char> colSet[9];
        set<char> rowSet[9];
        set<char> boxSet[9];
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char ch = board[i][j];
                
                if (ch == '.')
                    continue;
                
                if (colSet[j].find(ch) != colSet[j].end())
                    return false;
                
                colSet[j].insert(ch);
                
                if (rowSet[i].find(ch) != rowSet[i].end())
                    return false;
                
                rowSet[i].insert(ch);
                
                int boxId = i / 3 * 3 + j / 3;
                
                if (boxSet[boxId].find(ch) != boxSet[boxId].end())
                    return false;
                
                boxSet[boxId].insert(ch);
            }
        }
        
        return true;
    }
};