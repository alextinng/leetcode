package dev.alex.leetcode.solution;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Collectors;

public class _542 {
    public int[][] updateMatrix(int[][] mat) {
        int rowCnt = mat.length;
        int columnCnt = mat[0].length;

        int[][] distance = new int[rowCnt][columnCnt];
        for (int[] row : distance) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        // 队列里存储计算过距离的节点
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < rowCnt; i++) {
            // init queue
            int[] row = mat[i];
            for (int j = 0; j < row.length; j++) {
                if (mat[i][j] == 0) {
                    distance[i][j] = 0;
                    queue.offer(new int[]{i, j});
                }
            }

        }

        System.out.println("distance: \n" + Arrays.stream(distance)
                .map(Arrays::toString)
                .collect(Collectors.joining("\n")));

        System.out.printf("queue: %n%s%n", queue.stream()
                .map(Arrays::toString)
                .collect(Collectors.joining("\n")));

        while (!queue.isEmpty()) {
            int[] loc = queue.poll();
            int row = loc[0];
            int column = loc[1];

            int n = 1 + distance[row][column];
            if (row - 1 >= 0) {
                if (distance[row - 1][column] > n) {
                    distance[row - 1][column] = n;
                    queue.offer(new int[]{row - 1, column});
                }
            }
            if (row + 1 < rowCnt) {
                if (distance[row + 1][column] > n) {
                    distance[row + 1][column] = n;
                    queue.offer(new int[]{row + 1, column});
                }
            }
            if (column - 1 >= 0) {
                if (distance[row][column - 1] > n) {
                    distance[row][column - 1] = n;
                    queue.offer(new int[]{row, column - 1});
                }
            }
            if (column + 1 < columnCnt) {
                if (distance[row][column + 1] > n) {
                    distance[row][column + 1] = n;
                    queue.offer(new int[]{row, column + 1});
                }
            }

            System.out.println("distance: \n" + Arrays.stream(distance)
                    .map(Arrays::toString)
                    .collect(Collectors.joining("\n")));

            System.out.printf("queue: %n%s%n", queue.stream()
                    .map(Arrays::toString)
                    .collect(Collectors.joining("\n")));
        }

        return distance;
    }
}
