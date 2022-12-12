package dev.alex.leetcode.solution;

public class _11 {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0, right = height.length - 1;
        while (left < right) {
            System.out.printf("height[%d]: %d, height[%d]: %d%n", left, height[left], right, height[right]);
            int area = (right - left) * Math.min(height[left], height[right]);
            maxArea = Math.max(area, maxArea);

            if (height[left] < height[right]) left++;
            else right--;
        }

        return maxArea;
    }
}
