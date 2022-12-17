package dev.alex.leetcode.solution;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class _733Test {
    private _733 instance;

    @Before
    public void setUp() throws Exception {
        instance = new _733();
    }

    @Test
    public void floodFill() {
        int[][] image = instance.floodFill(new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}}, 1, 1, 2);
        for (int[] rows : image) {
            System.out.println(Arrays.toString(rows));
        }
    }
}