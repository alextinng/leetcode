package dev.alex.leetcode.solution;

import java.util.Arrays;

public class _189 {
    public void rotate(int[] nums, int k) {
        /*
         * 多次翻转
         *
         * input: [1,2,3,4,5,6,7], k=3
         *
         * step1: 全翻转 [7,6,5,4,3,2,1]
         * step2: 翻转前k个[5,6,7,4,3,2,1]
         * step3: 翻转后length-k个[5,6,7,1,2,3,4]
         */
        k = k % nums.length;
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int leftVal = nums[left];
            int rightVal = nums[right];
            nums[right] = leftVal;
            nums[left] = rightVal;
            left++;
            right--;
        }

        System.out.println("step1: " + Arrays.toString(nums));

        left = 0;
        right = k - 1;
        while (left < right) {
            int leftVal = nums[left];
            int rightVal = nums[right];
            nums[right] = leftVal;
            nums[left] = rightVal;
            left++;
            right--;
        }
        System.out.println("step2: " + Arrays.toString(nums));

        left = k;
        right = nums.length - 1;
        while (left < right) {
            int leftVal = nums[left];
            int rightVal = nums[right];
            nums[right] = leftVal;
            nums[left] = rightVal;
            left++;
            right--;
        }
        System.out.println("step3: " + Arrays.toString(nums));
    }
}
