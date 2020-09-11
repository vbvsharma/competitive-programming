class Solution {
    public int findPeakElement(List<Integer> a) {
        int i = 0;
        while (i + 1 < a.size() && a.get(i + 1) > a.get(i))
            i++;
        return a.get(i);
    }
}