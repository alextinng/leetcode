package dev.alex.leetcode.solution;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class _118Test {
    private _118 instance;

    @Before
    public void setup() {
        instance = new _118();
    }

    @Test
    public void generate() {
        List<List<Integer>> result = instance.generate(5);
        System.out.println(result);
    }
}