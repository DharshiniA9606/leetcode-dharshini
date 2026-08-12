// Last updated: 8/12/2026, 8:46:57 AM
class Solution {
    public void reverseString(char[] s) {
        int left =0;
        int right = s.length-1;
        while(left<right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}