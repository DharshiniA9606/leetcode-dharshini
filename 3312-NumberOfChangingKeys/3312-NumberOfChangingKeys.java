// Last updated: 8/12/2026, 8:40:17 AM
class Solution {
    public int countKeyChanges(String s) {
        s = s.toLowerCase();
        int count = 0;

        for (int i = 1; i < s.length(); i++) {

            if (s.charAt(i) != s.charAt(i - 1)) {
                count++;
            }
        }

        return count;
    }
}