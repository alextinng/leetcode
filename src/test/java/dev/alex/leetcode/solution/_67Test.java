package dev.alex.leetcode.solution;

import dev.alex.leetcode.solution._67;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class _67Test {
    private _67 instance;

    @Before
    public void setup() {
        instance = new _67();
    }

    @Test
    public void addBinary() {
        String s = instance.addBinary("1010", "1011");
        Assert.assertEquals("10101", s);
    }
}