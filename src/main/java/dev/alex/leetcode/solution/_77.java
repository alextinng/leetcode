package dev.alex.leetcode.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class _77 {


    public List<List<Integer>> combine(int n, int k) {
        return solution2(n, k);
    }

    private List<List<Integer>> recursive(int n, int k) {
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

    private List<List<Integer>> solution2(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        Stack<Integer> combine = new Stack<>();
        backtracking(result, combine, n, k, 1);

        return result;
    }

    private void backtracking(List<List<Integer>> result, Stack<Integer> combine,
                              int n, int k, int start) {
        System.out.printf("combine: %s, start: %d%n", Arrays.toString(combine.toArray()), start);

        if (k == combine.size()) {
            result.add(new ArrayList<>(combine));

            return;
        }

        for (int i = start; i <= n; i++) {
            System.out.println("i: " + i);
            combine.push(i);
            backtracking(result, combine, n, k, i + 1);
            combine.pop();
        }
    }
}
