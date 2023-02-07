package dev.alex.leetcode.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        // -4,-1,-1,0,1,1,2
        for (int i = 0; i <= nums.length - 3; ) {
            int left = i + 1;
            int right = nums.length - 1;

            System.out.printf("i: %d, left: %d, right: %d%n", i, left, right);

            while (left < right) {
                int sum = nums[left] + nums[right] + nums[i];
                if (sum < 0) {
                    left++;
                } else if (sum > 0) {
                    right--;
                } else {
                    result.add(new ArrayList<>(Arrays.asList(nums[i], nums[left], nums[right])));
                    int n = nums[right];
                    while (right > left && nums[right] == n) {
                        right--;
                    }
                }
            }

            int n = nums[i];
            while (i < nums.length && nums[i] == n) {
                i++;
            }
        }

        return result;
    }
}
