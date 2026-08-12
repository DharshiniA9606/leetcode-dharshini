// Last updated: 8/12/2026, 8:41:40 AM
class Solution {
    public String truncateSentence(String s, int k) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;

                if (count == k) {
                    return s.substring(0, i);
                }
            }
        }
        return s;
    }
}