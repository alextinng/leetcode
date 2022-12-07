package dev.alex.leetcode.solution;

public class _367 {
    public boolean isPerfectSquare(int num) {
        /*
            等差数列求和公式：
                a1+a2+a3+...+an = n(a1+an)/2

                1+3+5=3(1+(2*3)-1)/2 = 3(2*3)/2=3*3
                1+3+5+...+(2n-1)=n*n
         */
        int sumnum = 1;
        while (num > 0) {
            num -= sumnum;
            sumnum += 2;
        }

        return num == 0;
    }
}
