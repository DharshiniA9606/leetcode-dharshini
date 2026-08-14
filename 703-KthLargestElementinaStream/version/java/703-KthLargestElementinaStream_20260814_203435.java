// Last updated: 8/14/2026, 8:34:35 PM
1class Solution {
2    public int islandPerimeter(int[][] grid) {
3        int rows = grid.length;
4        int cols = grid[0].length;
5        int perimeter = 0;
6
7        for (int i = 0; i < rows; i++) {
8            for (int j = 0; j < cols; j++) {
9                if (grid[i][j] == 1) {
10                    if (i == 0 || grid[i - 1][j] == 0) perimeter++;
11                    if (i == rows - 1 || grid[i + 1][j] == 0) perimeter++;
12                    if (j == 0 || grid[i][j - 1] == 0) perimeter++;
13                    if (j == cols - 1 || grid[i][j + 1] == 0) perimeter++;
14                }
15            }
16        }
17
18        return perimeter;
19    }
20}