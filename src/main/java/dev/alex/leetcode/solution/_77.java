package dev.alex.leetcode.solution;

import java.util.ArrayList;
import java.util.List;

public class _77 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();

        if (n == k) {
            List<Integer> list = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                list.add(i);
            }
            result.add(list);

            return result;
        }

        if (k == 1) {
            for (int i = 1; i <= n; i++) {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                result.add(list);
            }

            return result;
        }

        List<List<Integer>> t = combine(n - 1, k - 1);
        for (List<Integer> numbs : t) {
            numbs.add(n);
            result.add(numbs);
        }

        List<List<Integer>> t2 = combine(n - 1, k);
        result.addAll(t2);

        return result;
    }
}
