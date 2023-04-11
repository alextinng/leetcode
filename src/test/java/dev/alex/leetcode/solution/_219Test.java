package dev.alex.leetcode.solution;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class _219Test {
    private _219 instance;

    @Before
    public void setup() {
        instance = new _219();
    }
    @Test
    public void testContainsNearbyDuplicate() {
        Assert.assertTrue(instance.containsNearbyDuplicate(new int[] {0,1,2,3,2,5}, 3));
    }
}