// Last updated: 8/12/2026, 8:39:54 AM
class Solution {
    public long minCost(int m, int n, int[][] penalty) {
        long[][][] dist = new long[m][n][2];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                Arrays.fill(dist[i][j],Long.MAX_VALUE);
            }
        }
        PriorityQueue<long[]> pq = new PriorityQueue<>((a,b)-> Long.compare(a[0],b[0]));
        long startCost = 1L;
        dist[0][0][1] = startCost;
        pq.offer(new long[]{startCost, 0,0,1});
        int[] dr = {-1,1,0,0};
        int[] dc = {0,0,-1,1};
    while(!pq.isEmpty()){
    long[] curr = pq.poll();
    long d=curr[0];
    int r =(int)curr[1];
    int c = (int)curr[2];
    int p = (int)curr[3];
    if(d>dist[r][c][p]) continue;
    if(r==m-1 && c==n-1){
        return d;
    }
    int nextP = 1-p;
    for(int i=0;i<4;i++){
        int nr = r+dr[i];
        int nc = c+dc[i];
        if(nr>=0 && nr<m && nc>=0 && nc<n){
            long ec = (long)(nr+1)*(nc+1);
            boolean isValidMove = false;
            if(p==1){
                if(i==1||i==3) isValidMove=true;
            }
            else{
                if(i==0||i==2) isValidMove=true;
            }
            long mc = ec +(isValidMove?0:penalty[r][c]);
            if(d+mc <dist[nr][nc][nextP]){
                dist[nr][nc][nextP]=d+mc;
                pq.offer(new long[]{d+mc,nr,nc,nextP});
            }
        }
    }
    long wc = penalty[r][c];
    if(d+wc <dist[r][c][nextP]){
        dist[r][c][nextP]=d+wc;
        pq.offer(new long[]{d+wc,r,c,nextP});
    }
    }
return Math.min(dist[m-1][n-1][0],dist[m-1][n-1][1]);

    }
}