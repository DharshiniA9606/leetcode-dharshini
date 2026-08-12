// Last updated: 8/12/2026, 8:48:11 AM
class Solution {
    public int countPrimes(int n) {

        boolean[] notPrime = new boolean[n];

        int count = 0;

        for (int i = 2; i < n; i++) {

            if (!notPrime[i]) {
                count++;

                for (int j = i + i; j < n; j += i) {
                    notPrime[j] = true;
                }
            }
        }

        return count;
    }
}