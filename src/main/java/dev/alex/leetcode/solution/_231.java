package dev.alex.leetcode.solution;

public class _231 {
    public boolean isPowerOfTwo(int n) {
        return solution2(n);
    }

    private boolean solution1(int n) {
        if (n < 1) return false;

        String s = Integer.toString(n, 2);
        System.out.println("s => " + s);
        int length = s.length();
        int cnt = 0;
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == '1') cnt++;
        }

        return cnt == 1;
    }

    private boolean solution2(int n) {
        if (n < 1) return false;

        int cnt = 0;
        while (n > 0) {
            int mod = n % 2;
            System.out.printf("mod => %d%n", mod);
            if (mod == 1) {
                cnt ++;
                if (cnt > 1) return false;
            }
            n = n / 2;
        }

        return true;
    }
}
