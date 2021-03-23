class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>> pascalTriangle;
        
        for (int row = 1; row <= numRows; row++) {
            vector<int> rowVector;
            rowVector.push_back(1);
            
            int i = 1;
            while (i < row-1) {
                rowVector.push_back(pascalTriangle[row - 2][i - 1] +
                              pascalTriangle[row - 2][i]);
                i++;
            }
            
            if (i < row)
                rowVector.push_back(1);
            
            pascalTriangle.push_back(rowVector);
        }
        
        return pascalTriangle;
    }
};