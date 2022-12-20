package dev.alex.leetcode.solution;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class _994Test {
    private _994 instance;

    @Before
    public void setUp() throws Exception {
        instance = new _994();
    }

    @Test
    public void orangesRotting() {
        /*
            2,1,1
            1,1,0
            0,1,1
         */
        System.out.println("case 1: ");
        Assert.assertEquals(4, instance.orangesRotting(new int[][]{{2, 1, 1}, {1, 1, 0}, {0, 1, 1}}));

        /*
            2,1,1
            1,1,1
            0,1,2
         */
        System.out.println("case 2: ");
        Assert.assertEquals(2, instance.orangesRotting(new int[][]{{2, 1, 1}, {1, 1, 1}, {0, 1, 2}}));
    }
}