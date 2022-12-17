package dev.alex.leetcode.solution;

import org.junit.Before;
import org.junit.Test;

public class _695Test {
    private _695 instance;

    @Before
    public void setUp() throws Exception {
        instance = new _695();
    }

    @Test
    public void maxAreaOfIsland() {
        int maxAreaOfIsland = instance.maxAreaOfIsland(new int[][]{
                        {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                        {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                        {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                        {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}
                }
        );
        System.out.println(maxAreaOfIsland);
    }
}