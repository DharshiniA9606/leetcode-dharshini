// Last updated: 8/12/2026, 8:47:32 AM
class Solution {
    public boolean isAnagram(String s, String t) {
       char c1[] = s.toCharArray();
       char c2[] = t.toCharArray(); 
       Arrays.sort(c1);
       Arrays.sort(c2);
       return Arrays.equals(c1,c2);
    }
}