package dev.alex.leetcode.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _350 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> list = new ArrayList<>();
        for (int i = 0, j = 0; i < nums1.length && j < nums2.length; ) {
            System.out.printf("num1[%d]: %d, num2[%d]: %d%n", i, nums1[i], j, nums2[j]);
            if (nums1[i] < nums2[j]) i++;
            else if (nums1[i] > nums2[j]) j++;
            else {
                list.add(nums1[i]);
                i++;
                j++;
            }
        }

        int size = list.size();
        int[] result = new int[size];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
