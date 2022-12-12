package dev.alex.leetcode.solution;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class _167Test {
    private _167 instance;

    @Before
    public void setUp() throws Exception {
        instance = new _167();
    }

    @Test
    public void twoSum() {
        System.out.println(Arrays.toString(instance.twoSum(new int[]{1, 2, 3, 4, 5, 11, 12, 13}, 9)));
    }
}