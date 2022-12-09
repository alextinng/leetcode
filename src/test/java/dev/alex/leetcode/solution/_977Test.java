package dev.alex.leetcode.solution;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class _977Test {
    private _977 instance;

    @Before
    public void setUp() throws Exception {
        instance = new _977();
    }

    @Test
    public void sortedSquares() {
//        int[] nums = instance.sortedSquares(new int[]{-4, -1, 0, 3, 10});
        int[] nums = instance.sortedSquares(new int[]{-5,-3,-2,-1});
        System.out.println(Arrays.toString(nums));

    }
}