package dev.alex.leetcode.solution;


import dev.alex.leetcode.solution._28;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

class _28Test {
    private _28 instance;

    @Before
    void setup() {
        instance = new _28();
    }

    @Test
    void haystackIsEmpty() {
        Assert.assertEquals(0, instance.strStr("", ""));
        Assert.assertEquals(-1, instance.strStr("", "a"));
    }

    @Test
    void needleIsEmpty() {
        Assert.assertEquals(0, instance.strStr("this is a test", ""));
    }

    @Test
    void needleLongerThanHaystack() {
        Assert.assertEquals(-1, instance.strStr("word", "this is a sentence"));
    }

    @Test
    void normal() {
        Assert.assertEquals(2, instance.strStr("hello", "ll"));
        Assert.assertEquals(3, instance.strStr("hello", "lo"));
        Assert.assertEquals(0, instance.strStr("hello", "he"));
        Assert.assertEquals(1, instance.strStr("hello", "el"));
        Assert.assertEquals(4, instance.strStr("hello", "o"));
        Assert.assertEquals(0, instance.strStr("a", "a"));
    }
}