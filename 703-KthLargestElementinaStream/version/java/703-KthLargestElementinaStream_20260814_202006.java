// Last updated: 8/14/2026, 8:20:06 PM
1class Solution {
2    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
3        if(image[sr][sc] == color) return image;
4        fill(image, sr, sc, color, image[sr][sc]);
5        return image;
6    }
7    public void fill(int[][] image, int sr, int sc, int color, int cur) {
8        if(sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length) return;
9        if(cur != image[sr][sc]) return;
10        image[sr][sc] = color;
11        fill(image, sr-1, sc, color, cur);
12        fill(image, sr+1, sc, color, cur);
13        fill(image, sr, sc-1, color, cur);
14        fill(image, sr, sc+1, color, cur);
15    }
16}