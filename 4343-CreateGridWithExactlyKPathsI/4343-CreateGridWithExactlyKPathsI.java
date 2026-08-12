// Last updated: 8/12/2026, 8:39:10 AM
import java.util.HashSet;
class Solution {
    private HashSet<Long> memo;
        private char[][] resgrid;
    
    public String[] createGrid(int m, int n, int k) {
        memo = new HashSet<>();
        resgrid = null;
        char[][] grid = new char[m][n];
        int[][] dp = new int[m][n];
        if(dfs(0,0,0L,grid,dp,m,n,k)){
            String[] res = new String[m];
            for(int i=0;i<m;i++){
                res[i]=new String(resgrid[i]);
            }
            return res;
        }
        return new String[0];
    }
    private boolean dfs(int r,int c,long profile,char[][]grid,int[][] dp,int m, int n,int k){
        if(r==m){
            if(dp[m-1][n-1]==k){
                resgrid = new char[m][n];
                for(int i=0;i<m;i++){
                    resgrid[i]= grid[i].clone();
                    
                }
                return true;
            }
            return false;
        }
        long statekey = ((long)r<<40)|((long)c<<32) | profile;
        if(memo.contains(statekey)){
            return false;
        }
        int nextR =(c==n-1)?r+1:r;
        int nextC = (c==n-1)?0:c+1;
        grid[r][c] = '.';
        int up = (r>0)?dp[r-1][c]:0;
        int left = (c>0)?dp[r][c-1]:0;
        int val = (r==0 && c==0)?1:(up+left);
        if(val>k+1) val =k+1;
        dp[r][c] = val;
        long nextprofile = (profile & ~(7L <<(c*3)))|((long)val<<(c*3));
        if(!(r==m-1 && c==n-1 && val !=k)){
            if(dfs(nextR,nextC,nextprofile,grid,dp,m,n,k)){
                return true;
            }
        }
        if(!((r==0&&c==0) || (r==m-1 && c==n-1))){
            grid[r][c] = '#';
            int valObs =0;
            dp[r][c]=valObs;
            long nextprofileOps = (profile & ~(7L <<(c*3)))|((long) valObs<<(c*3));
            if(dfs(nextR,nextC,nextprofileOps,grid,dp,m,n,k)){
                return true;
            }
        }
        memo.add(statekey);
        return false;
    }
}