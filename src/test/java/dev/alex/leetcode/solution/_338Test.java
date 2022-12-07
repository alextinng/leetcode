package dev.alex.leetcode.solution;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class _338Test {
    private _338 instance;

    @Before
    public void setUp() throws Exception {
        instance = new _338();
    }

    @Test
    public void countBits() {
        int[] ints = instance.countBits(2);
        System.out.println(Arrays.toString(ints));
    }
}