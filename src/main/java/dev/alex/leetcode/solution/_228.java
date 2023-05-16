package dev.alex.leetcode.solution;

import java.util.ArrayList;
import java.util.List;

public class _228 {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums.length > 0) {
            if (nums.length == 1) {
                result.add(Integer.toString(nums[0]));
            } else {
                Integer left = null, right = null;
                for (int i = 0; i < nums.length; i++) {
                    if (null == left) {
                        left = nums[i];
                        right = left;
                    }

                    if (i + 1 == nums.length) {
                        // 窗口右侧到达列表最后一位
                        right = nums[i];
                        if (left.equals(right)) {
                            result.add(Integer.toString(left));
                        } else {
                            result.add(String.format("%d->%d", left, right));
                        }
                    } else {
                        if (nums[i + 1] > nums[i] + 1) {
                            // 窗口不连续
                            if (left.equals(right)) {
                                result.add(Integer.toString(left));
                            } else {
                                result.add(String.format("%d->%d", left, right));
                            }

                            left = null;
                        } else {
                            right = nums[i + 1];
                        }
                    }
                }
            }
        }

        return result;
    }

    public List<String> solution2(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums.length > 0) {
            if (nums.length == 1) {
                result.add(Integer.toString(nums[0]));
            } else {
                // 快慢指针
                int slow = 0, fast = 0;
                while (fast < nums.length) {
                    if (fast + 1 == nums.length || nums[fast + 1] > nums[fast] + 1) {
                        // 窗口不连续或到达最后一位
                        if (slow == fast) {
                            result.add(Integer.toString(nums[slow]));
                        } else {
                            result.add(String.format("%d->%d", nums[slow], nums[fast]));
                        }

                        slow = fast + 1;
                        fast = slow;
                    } else {
                        // 窗口连续
                        fast++;
                    }
                }
            }
        }

        return result;
    }
}
