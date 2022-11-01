package dev.alex.leetcode.solution;

public class _35 {
    int doSearch(int[] nums, int target, int start, int end) {
        System.out.println("start => " + start + ", end => " + end);
        System.out.println("nums[start] => " + nums[start] + ", nums[end] => " + nums[end]);
        if (target > nums[end]) {
            return end + 1;
        }

        if (target < nums[start]) {
            return start - 1;
        }

        if (target == nums[start]) {
            return start;
        }

        if (target == nums[end]) {
            return end;
        }

        int mid = (end + start) / 2;
        System.out.println("mid => " + mid);
        if (target > nums[mid]) {
            return doSearch(nums, target, mid, end);
        } else {
            return doSearch(nums, target, start, mid);
        }


    }

    public int searchInsert(int[] nums, int target) {
        int start, end;
        for (start = 0, end = nums.length - 1; target > nums[start] && target < nums[end]; ) {
            System.out.println("start => " + start + ", end => " + end);
            int mid = (start + end) / 2;
            if (target > nums[mid]) {
                start = mid;
            } else {
                end = mid;
            }
        }

        if (target > nums[end]) {
            return end + 1;
        } else if (target < nums[start]) {
            return start - 1;
        } else if (target == nums[start]) {
            return start;
        } else {
            return end;
        }
    }
}
