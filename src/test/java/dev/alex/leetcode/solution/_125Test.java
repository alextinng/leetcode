package dev.alex.leetcode.solution;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class _125Test {
    private _125 instance;

    @Before
    public void setup() {
        instance = new _125();
    }

    @Test
    public void isPalindrome() {
        Assert.assertTrue(instance.isPalindrome("A man, a plan, a canal: Panama"));
        Assert.assertFalse(instance.isPalindrome("0P"));
    }
}