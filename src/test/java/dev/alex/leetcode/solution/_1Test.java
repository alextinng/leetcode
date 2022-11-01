package dev.alex.leetcode.solution;

import dev.alex.leetcode.solution._1;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class _1Test {
    private _1 instance;

    @Before
    public void setup() {
        instance = new _1();
    }

    @org.junit.Test
    public void testOnVariousNumber() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        final int[] expected = {0, 1};

        int[] result = instance.twoSum(nums, target);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void testOnSameNumber() {
        int[] nums = {3, 3};
        int target = 6;

        final int[] expected = {0, 1};

        int[] result = instance.twoSum(nums, target);
        Assert.assertArrayEquals(expected, result);
    }
}