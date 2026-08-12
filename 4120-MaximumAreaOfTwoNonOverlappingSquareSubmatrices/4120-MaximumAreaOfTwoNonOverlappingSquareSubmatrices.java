// Last updated: 8/12/2026, 8:39:35 AM
import java.util.Arrays;
class Solution {
    public int maxArea(int[][] mat) {
        if(mat==null || mat.length==0||mat[0].length==0) return 0;
        int n=mat.length;
        int m=mat[0].length;
        int maxsize = Math.min(n,m);
        int[][] dp = new int[n][m];
        int[] minR =  new int[maxsize+2];
        int[] maxR =  new int[maxsize+2];
        int[] minC =  new int[maxsize+2];
        int[] maxC =  new int[maxsize+2];
        Arrays.fill(minR,Integer.MAX_VALUE);
        Arrays.fill(minC,Integer.MAX_VALUE);
        Arrays.fill(maxR,Integer.MIN_VALUE);
        Arrays.fill(maxC,Integer.MIN_VALUE);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==1){
                    if(i==0||j==0){
                        dp[i][j]=1;
                    }
                    else{
                        dp[i][j]=1+Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));
                    }
                    int s = dp[i][j];
                    minR[s] = Math.min(minR[s],i);
                    maxR[s] = Math.max(maxR[s],i);
                    minC[s] = Math.min(minC[s],j);
                    maxC[s] = Math.max(maxC[s],j);
                }
            }
        }
        for(int s=maxsize;s>=1;s--){
            minR[s]=Math.min(minR[s],minR[s+1]);
            maxR[s]=Math.max(maxR[s],maxR[s+1]);
            minC[s]=Math.min(minC[s],minC[s+1]);
            maxC[s]=Math.max(maxC[s],maxC[s+1]);
        }
        for(int k=maxsize;k>=1;k--){
            if(minR[k]!=Integer.MAX_VALUE){
                if(maxR[k]-minR[k]>=k||maxC[k]-minC[k]>=k){
                    return k*k;
                }
            }
        }
        return 0;
    }
}