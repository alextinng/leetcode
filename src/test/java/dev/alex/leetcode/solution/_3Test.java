package dev.alex.leetcode.solution;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class _3Test {
    private _3 instance;

    @Before
    public void setUp() throws Exception {
        instance = new _3();
    }

    @Test
    public void lengthOfLongestSubstring() {
        System.out.println("case 1: ");
        Assert.assertEquals(3, instance.lengthOfLongestSubstring("abcca"));
        System.out.println("case 2: ");
        Assert.assertEquals(3, instance.lengthOfLongestSubstring("abcabcbb"));
        System.out.println("case 3: ");
        Assert.assertEquals(1, instance.lengthOfLongestSubstring("bbbbb"));
        System.out.println("case 4: ");
        Assert.assertEquals(1, instance.lengthOfLongestSubstring("a"));
    }
}