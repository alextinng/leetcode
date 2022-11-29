package dev.alex.leetcode.solution;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class _171Test {
    private _171 instance;

    @Before
    public void setup() {
        instance = new _171();
    }

    @Test
    public void titleToNumber() {
        Assert.assertEquals(1, instance.titleToNumber("A"));
        Assert.assertEquals(26, instance.titleToNumber("Z"));
        Assert.assertEquals(28, instance.titleToNumber("AB"));
        Assert.assertEquals(701, instance.titleToNumber("ZY"));
    }
}