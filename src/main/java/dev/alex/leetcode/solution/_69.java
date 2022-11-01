package dev.alex.leetcode.solution;

public class _69 {
    public int mySqrt(int x) {
        double k = 1.0;
        while (Math.abs(k * k - x) > 1e-9) {
            k = (k + x / k) / 2;
            System.out.println(k);
        }
        return (int) k;
    }
}
