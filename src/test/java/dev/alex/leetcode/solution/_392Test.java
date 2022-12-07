package dev.alex.leetcode.solution;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class _392Test {
    private _392 instance;

    @Before
    public void setUp() throws Exception {
        instance = new _392();
    }

    @Test
    public void isSubsequence() {
        Assert.assertTrue(instance.isSubsequence("a", "a"));
        Assert.assertFalse(instance.isSubsequence("a", "b"));
        Assert.assertTrue(instance.isSubsequence("ab", "abc"));
        Assert.assertTrue(instance.isSubsequence("ab", "ab"));
        Assert.assertFalse(instance.isSubsequence("ab", "ad"));
        Assert.assertFalse(instance.isSubsequence("ab", "adc"));
    }
}