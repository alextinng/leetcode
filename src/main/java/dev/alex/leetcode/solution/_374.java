package dev.alex.leetcode.solution;

public class _374 {
    public int guessNumber(int n) {

        if (guess(0) == 0) return 0;
        if (guess(n) == 0) return n;

        double start = 0, end = n;

        int pick = (int) (start + (end - start) / 2); // 防止计算时溢出
        int guess = guess(pick);
        while (guess != 0) {
            if (guess < 0) {
                end = pick;
            } else {
                start = pick;
            }
            pick = (int) (start + (end - start) / 2); // 防止计算时溢出
            guess = guess(pick);
        }

        return pick;
    }

    private int guess(int n) {
        // 库函数实现，空白函数仅供编写代码使用
        return 0;
    }
}
