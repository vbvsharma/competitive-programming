class Solution {
    public void duplicateZeros(int[] arr) {
        int len = 0;
        int i = 0;
        while (i < arr.length && len < arr.length) {
            if (arr[i] != 0) {
                len++;
            } else {
                len += 2;
            }
            i++;
        }
        
        int k = arr.length - 1;
        if (len == arr.length + 1) {
            arr[k] = 0;
            k--;
            i--;
        }
        
        while (k >= 0) {
            if (arr[i - 1] == 0) {
                arr[k] = 0;
                arr[k - 1] = 0;
                k = k - 2;
            } else {
                arr[k] = arr[i - 1];
                k--;
            }
            
            i--;
        }
    }
}