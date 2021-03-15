class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        colSet = [set() for _ in range(9)]
        rowSet = [set() for _ in range(9)]
        boxSet = [set() for _ in range(9)]
        
        for i in range(9):
            for j in range(9):
                ch = board[i][j]
                
                if ch == '.':
                    continue
                
                if ch in colSet[j]:
                    return False
                
                colSet[j].add(ch)
                
                if ch in rowSet[i]:
                    return False
                
                rowSet[i].add(ch)
                
                boxId = i // 3 * 3 + j // 3
                
                if ch in boxSet[boxId]:
                    return False
                
                boxSet[boxId].add(ch)
        
        return True