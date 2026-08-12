// Last updated: 8/12/2026, 8:43:24 AM
class Solution {
    public int fib(int n) {
        if (n <= 1) return n;
        int prev = 0;
        int cur = 1;
        int next=0;
        for(int a = 2;a<=n;a++){
            next = prev+cur;
            prev = cur;
            cur = next;
        }
        return cur;
    }
}