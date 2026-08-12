// Last updated: 8/12/2026, 8:49:46 AM
import java.util.*;

class Solution {
    public void solve(char[][] board) {
        if (board == null || board.length == 0) {
            return;
        }

        int m = board.length;
        int n = board[0].length;

        for (int j = 0; j < n; j++) {
            if (board[0][j] == 'O') {
                bfs(board, 0, j);
            }
            if (board[m - 1][j] == 'O') {
                bfs(board, m - 1, j);
            }
        }

        for (int i = 0; i < m; i++) {
            if (board[i][0] == 'O') {
                bfs(board, i, 0);
            }
            if (board[i][n - 1] == 'O') {
                bfs(board, i, n - 1);
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                } else if (board[i][j] == '#') {
                    board[i][j] = 'O';
                }
            }
        }
    }

    private void bfs(char[][] board, int r, int c) {
        int m = board.length;
        int n = board[0].length;

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{r, c});
        board[r][c] = '#';

        int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();

            for (int[] dir : dirs) {
                int nr = curr[0] + dir[0];
                int nc = curr[1] + dir[1];

                if (nr >= 0 && nr < m && nc >= 0 && nc < n && board[nr][nc] == 'O') {
                    board[nr][nc] = '#';
                    queue.offer(new int[]{nr, nc});
                }
            }
        }
    }
}