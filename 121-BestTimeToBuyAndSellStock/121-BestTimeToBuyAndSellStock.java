// Last updated: 8/12/2026, 8:49:54 AM
class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[] dp = new int[n];
        int minprice = prices[0];
        for(int i=1;i<n;i++){
            minprice=Math.min(minprice, prices[i]);
            dp[i]=Math.max(dp[i-1], prices[i]-minprice);
        }
        return dp[n-1];
    }
}