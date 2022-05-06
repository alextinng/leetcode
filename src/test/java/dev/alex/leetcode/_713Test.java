package dev.alex.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.annotation.Resource;

import static org.junit.Assert.*;

public class _713Test {
    private _713 instance;

    @Before
    public void setup() {
        instance = new _713();
    }

    @Test
    public void numSubarrayProductLessThanK() {
        int cnt = 0;
        int[] testData1 = {10,5,2,6};
        cnt = instance.numSubarrayProductLessThanK(testData1, 100);
        Assert.assertEquals(8, cnt);

        int[] testData2 = {1,2,3};
        cnt = instance.numSubarrayProductLessThanK(testData2, 0);
        Assert.assertEquals(0, cnt);

        int[] testData3 = {57,44,92,28,66,60,37,33,52,38,29,76,8,75,22};
        cnt = instance.numSubarrayProductLessThanK(testData3, 18);
        Assert.assertEquals(1, cnt);
    }
}