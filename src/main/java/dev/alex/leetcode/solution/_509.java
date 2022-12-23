package dev.alex.leetcode.solution;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class _509 {
    public int fib(int n) {
        if (0 == n) return 0;
        if (1 == n) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        _509 v = new _509();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 30; i++) {
            list.add(v.fib(i));
        }

        System.out.println(list);
    }
}
