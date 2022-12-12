package dev.alex.leetcode.solution;

import org.junit.Before;
import org.junit.Test;

public class _557Test {
    private _557 instance;

    @Before
    public void setUp() throws Exception {
        instance = new _557();
    }

    @Test
    public void reverseWords() {
        String s = instance.reverseWords("I love u");
        System.out.println(s);
    }
}