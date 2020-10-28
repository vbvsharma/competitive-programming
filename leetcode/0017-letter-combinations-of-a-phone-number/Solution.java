class Solution {
    private List<String> digitToLetters;
    private List<String> combinations;
    
    public List<String> letterCombinations(String digits) {
        combinations = new ArrayList<>();
        digitToLetters = new ArrayList<>();
        
        if (digits.length() == 0)
            return combinations;
        
        for (int i = 0; i < digits.length(); i++) {
            if (digits.charAt(i) == '2')
                digitToLetters.add("abc");
            else if (digits.charAt(i) == '3')
                digitToLetters.add("def");
            else if (digits.charAt(i) == '4')
                digitToLetters.add("ghi");
            else if (digits.charAt(i) == '5')
                digitToLetters.add("jkl");
            else if (digits.charAt(i) == '6')
                digitToLetters.add("mno");
            else if (digits.charAt(i) == '7')
                digitToLetters.add("pqrs");
            else if (digits.charAt(i) == '8')
                digitToLetters.add("tuv");
            else if (digits.charAt(i) == '9')
                digitToLetters.add("wxyz");
        }
        
        letterCombinations(0, new StringBuilder());
        
        return combinations;
    }
    
    private void letterCombinations(int index, StringBuilder c) {
        if (c.length() == digitToLetters.size()) {
            combinations.add(c.toString());
            return;
        }
        
        for (int i = 0; i < digitToLetters.get(index).length(); i++) {
            letterCombinations(index+1, c.append(digitToLetters.get(index).charAt(i)));
            c.deleteCharAt(c.length()-1);
        }
    }
}