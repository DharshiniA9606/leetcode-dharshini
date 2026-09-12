// Last updated: 9/12/2026, 2:47:43 PM
1class Solution {
2    public int[][] generateMatrix(int n) {
3        int arr[][]=new int[n][n];
4        int num=1,sr=0,sc=0,er=n-1,ec=n-1;
5        while(sr<=er&&sc<=ec){
6            for(int j=sc;j<=ec;j++){
7                arr[sr][j]=num;
8                num++;
9            }
10            sr++;
11            for(int i=sr;i<=er;i++){
12                arr[i][ec]=num;
13                num++;
14            }
15            ec--;
16            if(sr<=er){
17            for(int j=ec;j>=sc;j--){
18                arr[er][j]=num;
19                num++;
20            }
21            er--;
22            }
23            if(sc<=ec){
24            for(int i=er;i>=sr;i--){
25                arr[i][sc]=num;
26                num++;
27            }
28            sc++;
29            }
30        }
31        return arr;
32    }
33}