package dev.alex.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class _28Test {
    private _28 instance;

    @BeforeEach
    void setup() {
        instance = new _28();
    }

    @Test
    void haystackIsEmpty() {
        Assertions.assertEquals(0, instance.strStr("", ""));
        Assertions.assertEquals(-1, instance.strStr("", "a"));
    }

    @Test
    void needleIsEmpty() {
        Assertions.assertEquals(0, instance.strStr("this is a test", ""));
    }

    @Test
    void needleLongerThanHaystack() {
        Assertions.assertEquals(-1, instance.strStr("word", "this is a sentence"));
    }

    @Test
    void normal() {
        Assertions.assertEquals(2, instance.strStr("hello", "ll"));
        Assertions.assertEquals(3, instance.strStr("hello", "lo"));
        Assertions.assertEquals(0, instance.strStr("hello", "he"));
        Assertions.assertEquals(1, instance.strStr("hello", "el"));
        Assertions.assertEquals(4, instance.strStr("hello", "o"));
        Assertions.assertEquals(0, instance.strStr("a", "a"));
    }
}