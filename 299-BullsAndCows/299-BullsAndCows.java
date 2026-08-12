// Last updated: 8/12/2026, 8:47:14 AM
class Solution {
    public String getHint(String secret, String guess) {
        int bulls = 0;
        int cows = 0;
        int[] x = new int[10];
        int[] y = new int[10];

        int i = 0;
        while (i < secret.length()) {
            char r = secret.charAt(i);
            char t = guess.charAt(i);
            if (r == t) {
                bulls++;
            } else {
                x[r - '0']++;
                y[t - '0']++;
            }
            i++;
        }

        int d = 0;
        while (d < 10) {
            cows += Math.min(x[d], y[d]);
            d++;
        }

        return bulls + "A" + cows + "B";
    }
}