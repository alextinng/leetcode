package dev.alex.leetcode.solution;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class _409Test {
    private _409 instance;

    @Before
    public void setup() {
        instance = new _409();
    }

    @Test
    public void longestPalindrome() {
//        Assert.assertEquals(7, instance.longestPalindrome("abccccdd"));
//        Assert.assertEquals(1, instance.longestPalindrome("a"));
        Assert.assertEquals(7, instance.longestPalindrome("aaaaaccc"));
    }
}