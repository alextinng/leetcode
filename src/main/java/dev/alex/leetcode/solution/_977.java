package dev.alex.leetcode.solution;

public class _977 {
    public int[] sortedSquares(int[] nums) {
        if (nums.length < 2) {
            for (int i = 0; i < nums.length; i++) {
                nums[i] = nums[i] * nums[i];
            }

            return nums;
        }

        int[] result = new int[nums.length];
        int left = 0, right = nums.length - 1;
        if (nums[left] >= 0) {
            for (int i = 0; i < nums.length; i++) {
                result[i] = nums[i] * nums[i];
            }

            return result;
        }

        if (nums[right] <= 0) {
            for (int i = nums.length - 1; i >= 0; i--) {
                result[nums.length - 1 - i] = nums[i] * nums[i];
            }

            return result;
        }

        // find first num > 0
        int sep = 0;
        while (nums[sep] < 0) sep++;
        left = sep - 1;
        right = sep;

        int index = 0;
        while (left >= 0 || right < nums.length) {
            if (left >= 0) {
                if (right < nums.length) {
                    System.out.printf("leftVal: %d, rightVal: %d%n", nums[left], nums[right]);
                    if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                        result[index++] = nums[right] * nums[right];
                        right++;
                    } else {
                        result[index++] = nums[left] * nums[left];
                        left--;
                    }
                } else {
                    // 正数已全遍历过
                    result[index++] = nums[left] * nums[left];
                    left--;
                }
            } else {
                // 负数已全遍历过
                result[index++] = nums[right] * nums[right];
                right++;
            }

        }

        return result;
    }
}
