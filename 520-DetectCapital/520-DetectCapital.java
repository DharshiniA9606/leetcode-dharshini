// Last updated: 8/12/2026, 8:46:03 AM
class Solution {
    public boolean detectCapitalUse(String word) {

        int count = 0;

        for (char ch : word.toCharArray()) {
            if (Character.isUpperCase(ch))
                count++;
        }

        return count == word.length() ||
               count == 0 ||
               (count == 1 && Character.isUpperCase(word.charAt(0)));
    }
}