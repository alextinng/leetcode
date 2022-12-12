package dev.alex.leetcode.solution;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class _345Test {
    private _345 instance;

    @Before
    public void setUp() throws Exception {
        instance = new _345();
    }

    @Test
    public void reverseVowels() {
        Assert.assertEquals("holle", instance.reverseVowels("hello"));
    }
}