public class dfsGrid {
    public static void dfs(char[][] grid, int r, int c) {
        int rows = grid.length;
        int cols = grid[0].length;

        if (r < 0 || c < 0 || r >= rows || c >= cols || grid[r][c] == '0') {
            return;
        }

        grid[r][c] = '0';

        int[][] directions = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

        for (int[] dir : directions) {
            int nr = r + dir[0];
            int nc = c + dir[1];

            if (nr < 0 || nc < 0 || grid[nr][nc] == '0' || nr >= rows || nc >= cols) {
                continue;
            }

            dfs(grid, nr, nc);

        }

    }

    public static void main(String[] args) {
        char[][] grid = { { '1', '1', '1', '1', '0' }, { '1', '1', '0', '1', '0' }, { '1', '1', '0', '0', '0' },
                { '0', '0', '0', '0', '0' } };

        int r = grid.length;
        int c = grid[0].length;

        int islandCount = 0;
        for (int row = 0; row < r; row++) {
            for (int col = 0; col < c; col++) {
                if (grid[row][col] == '1') {
                    dfs(grid, row, col);
                    islandCount += 1;
                }
            }
        }

        System.out.println("total Islands: " + islandCount);
    }
}
