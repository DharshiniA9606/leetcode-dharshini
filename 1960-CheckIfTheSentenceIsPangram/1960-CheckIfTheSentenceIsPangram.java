// Last updated: 8/12/2026, 8:41:38 AM
class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26)
        {
            return false;
        }
        for(int ch='a';ch<='z';ch++)
        {
            if(sentence.indexOf(ch)<0)
            {
                return false;
            }
        }
        return true;
    }
}