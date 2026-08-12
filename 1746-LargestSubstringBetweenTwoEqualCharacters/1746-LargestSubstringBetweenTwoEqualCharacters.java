// Last updated: 8/12/2026, 8:41:52 AM
class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int ans = -1;
        for (int left = 0; left < s.length(); left++) {
            for (int right = left + 1; right < s.length(); right++) {
                if (s.charAt(left) == s.charAt(right)) {
                    ans = Math.max(ans, right - left - 1);
                }
            }
        }
        
        return ans;
    }
}
