// Last updated: 8/12/2026, 8:46:45 AM
class Solution {
    public boolean isPerfectSquare(int num) {
        long i;
        for(i = 1; i*i<num; i++);
        return i*i == num;
    }
}