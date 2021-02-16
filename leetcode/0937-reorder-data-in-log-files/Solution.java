class Solution {
    public String[] reorderLogFiles(String[] logs) {
        
        Arrays.sort(logs, (a, b) -> compare(a, b));
        
        return logs;
    }
    
    private int compare(String a, String b) {
        int aSpaceIndex = a.indexOf(" ");
        int bSpaceIndex = b.indexOf(" ");
        
        String aId = a.substring(0, aSpaceIndex);
        String bId = b.substring(0, bSpaceIndex);
        
        String aContent = a.substring(aSpaceIndex + 1);
        String bContent = b.substring(bSpaceIndex + 1);
        
        boolean aIsLetterLog = Character.isAlphabetic(aContent.charAt(0));
        boolean bIsLetterLog = Character.isAlphabetic(bContent.charAt(0));
        
        if (aIsLetterLog && bIsLetterLog) {
            return aContent.compareTo(bContent) == 0 ? aId.compareTo(bId) : aContent.compareTo(bContent);
        } else if (aIsLetterLog && !bIsLetterLog) {
            return -1;
        } else if (!aIsLetterLog && bIsLetterLog) {
            return 1;
        } else {
            return 0;
        }
    }
}