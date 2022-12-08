package dev.alex.leetcode.solution;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class _704Test {
    private _704 instance;

    @Before
    public void setUp() throws Exception {
        instance = new _704();
    }

    @Test
    public void search() {
        Assert.assertEquals(1, instance.search(new int[]{2, 5}, 5));

        Assert.assertEquals(0, instance.search(new int[]{0, 1, 2, 3}, 0));
        Assert.assertEquals(1, instance.search(new int[]{0, 1, 2, 3}, 1));
        Assert.assertEquals(2, instance.search(new int[]{0, 1, 2, 3}, 2));
        Assert.assertEquals(3, instance.search(new int[]{0, 1, 2, 3}, 3));
        Assert.assertEquals(-1, instance.search(new int[]{0, 1, 2, 3}, 9));

        Assert.assertEquals(1, instance.search(new int[]{0, 1, 2, 3, 4}, 1));
        Assert.assertEquals(2, instance.search(new int[]{0, 1, 2, 3, 4}, 2));
        Assert.assertEquals(3, instance.search(new int[]{0, 1, 2, 3, 4}, 3));
        Assert.assertEquals(-1, instance.search(new int[]{0, 1, 2, 3, 4}, 9));
    }
}