// Last updated: 8/12/2026, 8:44:28 AM
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char c=letters[0];
        int tar=target-'a';
        for(int i=0;i<letters.length;i++){
            int t=(int)letters[i]-'a';
            if(t>tar) {
                c= letters[i];
                break;
            }
        }
        return c;
    }
}