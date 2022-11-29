package dev.alex.leetcode.solution;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class _136Test {
    private _136 instance;

    @Before
    public void setup() {
        instance = new _136();
    }

    @Test
    public void test() throws Exception {
        int[] nums = {2,2,1};
        int res = instance.singleNumber(nums);
        Assert.assertEquals(1, res);
    }
}