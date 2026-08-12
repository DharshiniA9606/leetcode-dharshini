// Last updated: 8/12/2026, 8:39:27 AM
class Solution {
    public int maxConsistentColumns(int[][] grid, int limit) {
        if(grid==null ||grid.length==0||grid[0].length==0){
            return 0;
        }
        int m =grid.length;
        int n = grid[0].length;
        int[][] cols = new int[n][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                cols[j][i] = grid[i][j];
            }
        }
        int[] dp = new int[n];
        int maxcol = 0;
        for(int j=0;j<n;j++){
            dp[j]=1;
            int[] colj = cols[j];
            for(int k=0;k<j;k++){
                int[] colk = cols[k];
                boolean consistent = true;
                for(int i=0;i<m;i++){
                    if(Math.abs(colj[i]-colk[i])>limit){
                        consistent = false;
                        break;
                    }
                }
                if(consistent){
                    dp[j]= Math.max(dp[j],dp[k]+1);
                }
            }
            maxcol = Math.max(maxcol,dp[j]);
            
        }
        return maxcol;
    }
}