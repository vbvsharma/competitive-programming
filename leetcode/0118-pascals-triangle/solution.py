class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        ans = list()
        
        for rowNum in range(numRows):
            row = list()
            row.append(1)
            
            i = 1
            while i < rowNum:
                row.append(ans[rowNum - 1][i] + ans[rowNum - 1][i - 1])
                i += 1
            
            if i <= rowNum:
                row.append(1)
            
            ans.append(row)
        
        return ans