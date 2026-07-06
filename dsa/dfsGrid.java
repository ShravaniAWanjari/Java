public class dfsGrid {
    public void dfs(char[][] grid, int r, int c, boolean[][] visited) {
        int rows = grid.length;
        int cols = grid[0].length;

        if (r < 0 || c < 0 || r >= rows || c >= cols || visited[r][c]) {
            return;
        }

        visited[r][c] = true;

        int[][] directions = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

        for (int[] dir : directions) {
            int nr = r + dir[0];
            int nc = c + dir[1];

            if (nr < 0 || nc < 0 || visited[nr][nc] == true || nr >= rows || nc >= cols) {
                continue;
            }

            dfs(grid, nr, nc, visited);

        }
    }
}
