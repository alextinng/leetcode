package dev.alex.leetcode.solution;

import org.junit.Before;
import org.junit.Test;

import java.util.Set;
import java.util.TreeSet;

public class _401Test {
    private _401 instance;

    @Before
    public void setUp() {
        instance = new _401();
    }

    @Test
    public void readBinaryWatch() {
        Set<String> set = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            set.addAll(instance.readBinaryWatch(i));
        }
        System.out.println(set);
    }
}