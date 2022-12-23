package dev.alex.leetcode.solution;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class _349Test {
    private _349 instance;

    @Before
    public void setUp() throws Exception {
        instance = new _349();
    }

    @Test
    public void intersection() {
        int[] intersection = instance.intersection(new int[]{1,2,2,1}, new int[]{2,2});
        System.out.println(Arrays.toString(intersection));
    }
}