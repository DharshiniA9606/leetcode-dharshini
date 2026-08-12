// Last updated: 8/12/2026, 8:52:07 AM
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int original = x;
        int rev = 0;
        while(x>0) {
            int digit = x % 10;
            rev = rev * 10 + digit;
            x /=10;
        }
        return rev == original;
        
    }
}