package dev.alex.leetcode;


import org.junit.Before;
import org.junit.Test;

public class _66Test {
    private _66 instance;

    @Before
    public void setup() {
        instance = new _66();
    }

    @Test
    public void testPlusOne() {
        instance.plusOne(new int[]{9,8,7,6,5,4,3,2,1,0});
    }
}