// Last updated: 9/12/2026, 4:29:00 PM
class Solution {
    public int smallestNumber(int n, int t) {
        while (true) {
            int product = 1;
            int x = n;

            while (x > 0) {
                product *= (x % 10);
                x /= 10;
            }

            if (product % t == 0)
                return n;

            n++;
        }
    }
}