package dev.alex.leetcode.solution;

import dev.alex.leetcode.solution._58;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class _58Test {
    private _58 instance;

    @Before
    public void setup() {
        instance = new _58();
    }

    @Test
    public void testLengthOfLastWord() {
//        Assert.assertEquals(5, instance.lengthOfLastWord("hello boys"));

//        Assert.assertEquals(9, instance.lengthOfLastWord("    good afternoon    "));

        Assert.assertEquals(6, instance.lengthOfLastWord("luffy is still joyboy"));
    }
}