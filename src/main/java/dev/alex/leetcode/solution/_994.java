package dev.alex.leetcode.solution;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.stream.Collectors;

public class _994 {
    public int orangesRotting(int[][] grid) {
        int minutes = 0;

        int rowCnt = grid.length;
        int columnCnt = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < grid.length; i++) {
            int[] row = grid[i];
            for (int j = 0; j < row.length; j++) {
                if (row[j] == 2) {
                    queue.add(new int[]{i, j});
                }
            }
        }

        int queueSize = queue.size();

        while (hasFreshOrange(grid) && !queue.isEmpty()) {
            minutes++;
            System.out.println("queue: " + queue.stream()
                    .map(arr -> String.format("(%d,%d)", arr[0], arr[1]))
                    .collect(Collectors.joining(",")));

            int newCnt = 0;
            for (int i = 0; i < queueSize; i++) {
                int[] loc = queue.poll();
                if (Objects.isNull(loc)) break;
                int row = loc[0];
                int column = loc[1];
                if (row - 1 >= 0) {
                    if (grid[row - 1][column] == 1) {
                        grid[row - 1][column] = 2;
                        queue.offer(new int[]{row - 1, column});
                        newCnt++;
                    }
                }
                if (row + 1 < rowCnt) {
                    if (grid[row + 1][column] == 1) {
                        grid[row + 1][column] = 2;
                        queue.offer(new int[]{row + 1, column});
                        newCnt++;
                    }
                }
                if (column - 1 >= 0) {
                    if (grid[row][column - 1] == 1) {
                        grid[row][column - 1] = 2;
                        queue.offer(new int[]{row, column - 1});
                        newCnt++;
                    }
                }
                if (column + 1 < columnCnt) {
                    if (grid[row][column + 1] == 1) {
                        grid[row][column + 1] = 2;
                        queue.offer(new int[]{row, column + 1});
                        newCnt++;
                    }
                }
            }

            queueSize = newCnt;
            System.out.println("grid: \n" + Arrays.stream(grid).map(Arrays::toString)
                    .collect(Collectors.joining("\n")));
        }

        if (hasFreshOrange(grid)) {
            return -1;
        } else {
            return minutes;
        }
    }

    private boolean hasFreshOrange(int[][] grid) {
        for (int[] row : grid) {
            for (int column : row) {
                if (column == 1) return true;
            }
        }

        return false;
    }
}
