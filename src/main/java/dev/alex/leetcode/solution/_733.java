package dev.alex.leetcode.solution;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class _733 {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        return solution2(image, sr, sc, color);
    }

    private int[][] solution1(int[][] image, int sr, int sc, int color) {
        if (image.length == 0) return image;

        Set<Pair> visited = new HashSet<>();
        Queue<Pair> queue = new LinkedList<>();
        int originalColor = image[sr][sc];
        queue.add(new Pair(sr, sc));

        int maxX = image.length;
        int maxY = image[0].length;

        while (!queue.isEmpty()) {
            Pair head = queue.poll();
            int x = head.x;
            int y = head.y;

            visited.add(head);
            System.out.printf("current node: (%d,%d)%n", x, y);
            System.out.println("visited: " + visited);

            if (image[x][y] == originalColor) {
                image[x][y] = color;
            }
            // up
            if (x - 1 >= 0 && image[x - 1][y] == originalColor) {
                Pair p = new Pair(x - 1, y);
                if (!visited.contains(p)) {
                    System.out.printf("put node into queue: (%d,%d)%n", x - 1, y);
                    queue.offer(p);
                    visited.add(p);
                }
            }
            // down
            if (x + 1 < maxX && image[x + 1][y] == originalColor) {
                Pair p = new Pair(x + 1, y);
                if (!visited.contains(p)) {
                    System.out.printf("put node into queue: (%d,%d)%n", x + 1, y);
                    queue.offer(p);
                    visited.add(p);
                }
            }
            // left
            if (y - 1 >= 0 && image[x][y - 1] == originalColor) {
                Pair p = new Pair(x, y - 1);
                if (!visited.contains(p)) {
                    System.out.printf("put node into queue: (%d,%d)%n", x, y - 1);
                    queue.offer(p);
                    visited.add(p);
                }
            }
            // right
            if (y + 1 < maxY && image[x][y + 1] == originalColor) {
                Pair p = new Pair(x, y + 1);
                if (!visited.contains(p)) {
                    System.out.printf("put node into queue: (%d,%d)%n", x, y + 1);
                    queue.offer(p);
                    visited.add(p);
                }
            }
        }

        System.out.println("queue: " + queue);

        return image;
    }

    private int[][] solution2(int[][] image, int sr, int sc, int color) {
        if (image.length == 0) return image;

        Queue<Pair> queue = new LinkedList<>();
        int originalColor = image[sr][sc];
        queue.add(new Pair(sr,sc));

        int maxX = image.length;
        int maxY = image[0].length;
        int[][] visited = new int[maxX][maxY];

        while (!queue.isEmpty()) {
            Pair head = queue.poll();
            int x = head.x;
            int y = head.y;

            visited[x][y] = 1;
            System.out.printf("current node: (%d,%d)%n", x, y);

            if (image[x][y] == originalColor) {
                image[x][y] = color;
            }
            // up
            if (x - 1 >= 0 && image[x - 1][y] == originalColor) {
                Pair p = new Pair(x - 1, y);
                if (visited[x - 1][y] == 0) {
                    System.out.printf("put node into queue: (%d,%d)%n", x - 1, y);
                    queue.offer(p);
                    visited[x - 1][y] = 1;
                }
            }
            // down
            if (x + 1 < maxX && image[x + 1][y] == originalColor) {
                Pair p = new Pair(x + 1, y);
                if (visited[x + 1][y] == 0) {
                    System.out.printf("put node into queue: (%d,%d)%n", x + 1, y);
                    queue.offer(p);
                    visited[x + 1][y] = 1;
                }
            }
            // left
            if (y - 1 >= 0 && image[x][y - 1] == originalColor) {
                Pair p = new Pair(x, y - 1);
                if (visited[x][y - 1] == 0) {
                    System.out.printf("put node into queue: (%d,%d)%n", x, y - 1);
                    queue.offer(p);
                    visited[x][y - 1] = 1;
                }
            }
            // right
            if (y + 1 < maxY && image[x][y + 1] == originalColor) {
                Pair p = new Pair(x, y + 1);
                if (visited[x][y + 1] == 0) {
                    System.out.printf("put node into queue: (%d,%d)%n", x, y + 1);
                    queue.offer(p);
                    visited[x][y + 1] = 1;
                }
            }
        }

        System.out.println("queue: " + queue);

        return image;
    }

    static class Pair {
        int x, y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return String.format("(%d,%d)", x, y);
        }

        @Override
        public int hashCode() {
            return this.toString().hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof Pair))
                return false;

            return this.toString().equals(obj.toString());
        }
    }
}
