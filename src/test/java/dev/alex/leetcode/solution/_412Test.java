package dev.alex.leetcode.solution;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class _412Test {
    private _412 instance;

    @Before
    public void setup() {
        instance = new _412();
    }

    @Test
    public void fizzBuzz() {
        List<String> strings = instance.fizzBuzz(3);
        System.out.println(strings);
    }
}