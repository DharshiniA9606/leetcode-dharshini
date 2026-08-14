// Last updated: 8/14/2026, 8:33:31 PM
1class Solution {
2    int ans=0;
3    public int islandPerimeter(int[][] grid) {
4        int[][] way = {{1, 0},{-1, 0},{0, 1},{0, -1}};
5        int n=grid.length;
6        int m=grid[0].length;
7        boolean[][] visit=new boolean[n][m];
8        for(int i=0;i<n;++i){
9            for(int j=0;j<m;++j){
10                if(!visit[i][j] && grid[i][j]==1){
11                    dfs(grid,i,j,way,visit);
12                    return ans;
13                }
14            }
15        }
16        return 0;
17    }
18    private void dfs(int[][] grid, int i, int j , int[][] way, boolean[][] visit){
19        visit[i][j]=true;
20        for(int[] a:way){
21            int i1= a[0]+i;
22            int j1=a[1]+j;
23            if (i1 < 0 || i1 >= grid.length || j1 < 0 || j1 >= grid[0].length) ans++;
24            else if(grid[i1][j1]==0) ans++;
25            else if(!visit[i1][j1] && grid[i1][j1]==1){
26                dfs(grid,i1,j1,way,visit);
27            }
28        }
29    }
30}