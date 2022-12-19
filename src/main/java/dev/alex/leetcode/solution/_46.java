package dev.alex.leetcode.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class _46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        if (nums.length == 1) {
            List<Integer> l = new ArrayList<>();
            l.add(nums[0]);
            result.add(l);

            return result;
        }

        int[] arr = Arrays.copyOfRange(nums, 0, nums.length - 1);
        List<List<Integer>> tmp = permute(arr);
        for (List<Integer> t : tmp) {
            int size = t.size();
            for (int i = 0; i <= size; i++) {
                List<Integer> l = new LinkedList<>(t);
                l.add(i, nums[nums.length - 1]);
                result.add(l);
            }
        }

        return result;
    }
}
