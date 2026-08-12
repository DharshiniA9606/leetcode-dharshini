// Last updated: 8/12/2026, 8:47:00 AM
class Solution {
    public boolean isPowerOfFour(int n) {
        if (n == 1) return true;
        if (n <= 0 || n % 4 != 0) return false;
        return isPowerOfFour(n / 4);
    }
}