package dev.alex.leetcode.solution;

public class _1137 {
    public int tribonacci(int n) {
        if (0 == n) return 0;
        if (1 == n) return 1;
        if (2 == n) return 1;

        int left = 0, middle = 1, right = 1, result = 2;
        for (int i = 3; i <= n; i++) {
            result = left + middle + right;
            left = middle;
            middle = right;
            right = result;

            System.out.printf("i: %d, result: %d%n", i, result);
        }

        return result;
    }
}
