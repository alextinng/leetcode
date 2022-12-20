package dev.alex.leetcode.solution;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class _198Test {
    private _198 instance;

    @Before
    public void setUp() throws Exception {
        instance = new _198();
    }

    @Test
    public void rob() {
        System.out.println("case 1:");
        Assert.assertEquals(4, instance.rob(new int[]{1, 2, 3, 1}));

        System.out.println("case 2:");
        Assert.assertEquals(2, instance.rob(new int[]{1, 2}));

        System.out.println("case 3:");
        Assert.assertEquals(4, instance.rob(new int[]{2, 1, 1, 2}));
    }
}