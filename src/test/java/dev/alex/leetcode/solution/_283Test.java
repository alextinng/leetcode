package dev.alex.leetcode.solution;

import org.junit.Before;
import org.junit.Test;

public class _283Test {
    private _283 instance;

    @Before
    public void setUp() throws Exception {
        instance = new _283();
    }

    @Test
    public void moveZeroes() {
        instance.moveZeroes(new int[]{0});
        instance.moveZeroes(new int[]{0, 0});
        instance.moveZeroes(new int[]{0, 1});
        instance.moveZeroes(new int[]{1, 2});
        instance.moveZeroes(new int[]{0, 0, 1});
        instance.moveZeroes(new int[]{0, 1, 0});
        instance.moveZeroes(new int[]{1, 0, 0});
        instance.moveZeroes(new int[]{0, 1, 0, 2});
        instance.moveZeroes(new int[]{1, 0, 2, 0});
    }
}