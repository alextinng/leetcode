package dev.alex.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class _88Test {
    private _88 instance;

    @Before
    public void setup() {
        instance = new _88();
    }

    @Test
    public void merge() {
        instance.merge(new int[]{1, 2, 5, 0, 0, 0}, 3, new int[]{1, 2, 3}, 3);
    }
}