// Last updated: 8/12/2026, 8:42:07 AM
class Solution {
    public int removePalindromeSub(String s) {
       return new StringBuilder(s).reverse().toString().equals(s) ? 1 : 2; 
    }
}