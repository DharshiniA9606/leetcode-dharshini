// Last updated: 8/12/2026, 8:50:57 AM
class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int len = 0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                len ++;
            }
            else if(len>0){
                break;
            }
        }
        return len;

    }
}