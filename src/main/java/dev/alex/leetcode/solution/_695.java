package dev.alex.leetcode.solution;

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Collectors;

public class _695 {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;

        int maxX = grid.length;
        int maxY = grid[0].length;
        int[][] visited = new int[maxX][maxY];

        for (int i = 0; i < grid.length; i++) {
            int[] rows = grid[i];
            for (int j = 0; j < rows.length; j++) {
                if (grid[i][j] > 0) {
                    System.out.printf("start from : %d,%d%n", i, j);
                    maxArea = Math.max(maxArea, visitIsland(grid, i, j, visited));
                }
            }
        }

        return maxArea;
    }

    private int visitIsland(int[][] grid, int x, int y, int[][] visited) {
        if (visited[x][y] > 1) return 0;

        int area = 0;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        visited[x][y] = 1;
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int i = cur[0];
            int j = cur[1];
            area += grid[i][j];

            if (i - 1 >= 0 && visited[i - 1][j] < 1) {
                visited[i - 1][j] = 1;
                if (grid[i - 1][j] > 0) {
                    queue.add(new int[]{i - 1, j});
                }
            }
            if (i + 1 < grid.length && visited[i + 1][j] < 1) {
                visited[i + 1][j] = 1;
                if (grid[i + 1][j] > 0) {
                    queue.add(new int[]{i + 1, j});
                }
            }
            if (j - 1 >= 0 && visited[i][j - 1] < 1) {
                visited[i][j - 1] = 1;
                if (grid[i][j - 1] > 0) {
                    queue.add(new int[]{i, j - 1});
                }
            }
            if (j + 1 < grid[i].length && visited[i][j + 1] < 1) {
                visited[i][j + 1] = 1;
                if (grid[i][j + 1] > 0) {
                    queue.add(new int[]{i, j + 1});
                }
            }

            System.out.println("queue: " + queue.stream().map(arr -> String.format("(%d,%d)", arr[0], arr[1]))
                    .collect(Collectors.joining(",")));
        }

        return area;
    }
}
