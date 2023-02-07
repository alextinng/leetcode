package dev.alex.leetcode.solution;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class _15Test {
    private _15 instance;

    @Before
    public void setUp() throws Exception {
        instance = new _15();
    }

    @Test
    public void threeSum() {
        List<List<Integer>> lists = instance.threeSum(new int[]{0, 0, 0, 0});
        System.out.println(lists);
    }
}