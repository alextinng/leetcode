package dev.alex.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class _796Test {
    private _796 instance;

    @Before
    public void setup() {
        instance = new _796();
    }

    @Test
    public void answer() {
        Assert.assertTrue(instance.answer("a", "a"));
        Assert.assertFalse(instance.answer("a", "b"));

        Assert.assertTrue(instance.answer("ab", "ba"));
        Assert.assertTrue(instance.answer("ab", "ab"));
        Assert.assertFalse(instance.answer("ab", "ac"));

        Assert.assertFalse(instance.answer("abcde", "abced"));
        Assert.assertTrue(instance.answer("abcde", "cdeab"));
    }
}