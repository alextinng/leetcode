package dev.alex.leetcode.solution;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _1863 {
    public int subsetXORSum(int[] nums) {
        int result = 0;
        if (nums.length == 0) return result;

        for (int size = 1; size <= nums.length; size++) {
            result += subsetXORSum(nums, size);
        }

        return result;
    }

    private int subsetXORSum(int[] nums, int size) {
        List<Integer> xorSums = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        backtracking(xorSums, stack, nums, size, 0);

        return xorSums.stream().reduce(Integer::sum).orElse(0);
    }

    private void backtracking(List<Integer> xorSums, Stack<Integer> stack, int[] nums, int size, int start) {
        if (stack.size() == size) {
            xorSums.add(XORSum(stack));
            System.out.println("subset: " + stack);
        } else {
            for (int off = start; off < nums.length; off++) {
                stack.push(nums[off]);
                backtracking(xorSums, stack, nums, size, off + 1);
                stack.pop();
            }
        }
    }

    private int XORSum(Stack<Integer> stack) {
        int result = stack.get(0);
        for (int i = 1; i < stack.size(); i++) {
            result = result ^ stack.get(i);
        }

        return result;
    }
}
