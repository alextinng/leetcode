package dev.alex.leetcode.solution;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class _217Test {
    private _217 instance;

    @Before
    public void setup() {
        instance = new _217();
    }

    @Test
    public void containsDuplicate() {
        int[] nums1 = {1000000000, 1000000000, 11};
        Assert.assertTrue(instance.containsDuplicate(nums1));
    }
}