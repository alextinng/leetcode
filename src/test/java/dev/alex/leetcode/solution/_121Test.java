package dev.alex.leetcode.solution;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class _121Test {
    private _121 instance;

    @Before
    public void setup() {
        instance = new _121();
    }

    @Test
    public void test1() {
        int[] prices = {7,1,5,3,6,4};
        int expected = 5;
        int actual = instance.maxProfit(prices);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        int[] prices = {7,6,4,3,1};
        int expected = 0;
        int actual = instance.maxProfit(prices);
        Assert.assertEquals(expected, actual);
    }
}