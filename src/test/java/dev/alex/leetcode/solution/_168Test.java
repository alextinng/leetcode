package dev.alex.leetcode.solution;

import org.junit.Before;
import org.junit.Test;

public class _168Test {
    private _168 instance;

    @Before
    public void setup() {
        instance = new _168();
    }

    @Test
    public void convertToTitle() {
        String s = instance.convertToTitle(26);
        System.out.println(s);
    }
}