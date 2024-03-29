package dev.alex.leetcode.solution;

import java.util.Arrays;

public class _283 {
    public void moveZeroes(int[] nums) {
        /*
         slow point to first zero num(from left), fast point to first non-zero num(from slow)

         init
            1. find first zero num
            2. set slow
         */
        int slow = 0;
        while (slow < nums.length && nums[slow] != 0) slow++;

        int fast = slow;
        while (fast < nums.length && nums[fast] == 0) fast++;

        while (slow < fast && fast < nums.length) {
            // find non-zero num
            nums[slow] = nums[fast];
            nums[fast] = 0;

            // re-find first zero num
            while (slow < nums.length && nums[slow] != 0) slow++;

            fast = slow + 1;
            while (fast < nums.length && nums[fast] == 0) fast++;
        }

        System.out.println("array: " + Arrays.toString(nums));
    }

    private void officialSolution(int[] nums) {
        /*
            这里参考了快速排序的思想，快速排序首先要确定一个待分割的元素做中间点x，然后把所有小于等于x的元素放到x的左边，
            大于x的元素放到其右边。这里我们可以用0当做这个中间点，把不等于0(注意题目没说不能有负数)的放到中间点的左边，
            等于0的放到其右边。这的中间点就是0本身，所以实现起来比快速排序简单很多，我们使用两个指针i和j，只要nums[i]!=0，
            我们就交换nums[i]和nums[j]
         */
        if (nums == null) {
            return;
        }
        //两个指针i和j
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            //当前元素!=0，就把其交换到左边，等于0的交换到右边
            if (nums[i] != 0) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j++] = tmp;
            }
        }
    }
}
