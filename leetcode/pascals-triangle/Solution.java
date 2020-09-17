class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalTriangle = new ArrayList<>();
        
        for (int row = 1; row <= numRows; row++) {
            pascalTriangle.add(new ArrayList<>(row));
            pascalTriangle.get(row-1).add(1);
            
            int i = 1;
            while (i < row-1) {
                pascalTriangle.get(row-1).add(pascalTriangle.get(row-2).get(i-1) + pascalTriangle.get(row-2).get(i));
                i++;
            }
            
            if (i < row)
                pascalTriangle.get(row-1).add(1);
        }
        
        return pascalTriangle;
    }
}