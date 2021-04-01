class Solution {
public:
    void setZeroes(vector<vector<int>>& matrix) {
        int r = matrix.size();
        int c = matrix[0].size();
        bool isFirstColZero = false;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (j == 0 && matrix[i][j] == 0) {
                    isFirstColZero = true;
                } else if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        
        for (int i = 1; i < r; i++) {
            if (matrix[i][0] != 0)
                continue;
            for (int j = 1; j < c; j++) {
                matrix[i][j] = 0;
            }
        }
        for (int j = 1; j < c; j++) {
            if (matrix[0][j] != 0)
                continue;
            for (int i = 1; i < r; i++) {
                matrix[i][j] = 0;
            }
        }
        
        if (matrix[0][0] == 0) {
            for (int i = 0; i < c; i++)
                matrix[0][i] = 0;
        }
        
        if (isFirstColZero) {
            for (int i = 0; i < r; i++)
                matrix[i][0] = 0;
        }
    }
};