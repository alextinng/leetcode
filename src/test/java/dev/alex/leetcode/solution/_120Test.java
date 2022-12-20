package dev.alex.leetcode.solution;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class _120Test {
    private _120 instance;

    @Before
    public void setUp() throws Exception {
        instance = new _120();
    }

    @Test
    public void minimumTotal() {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(Collections.singletonList(2));
        triangle.add(Arrays.asList(3,4));
        triangle.add(Arrays.asList(6,5,7));
        triangle.add(Arrays.asList(4,1,8,4));
        int total = instance.minimumTotal(triangle);
        Assert.assertEquals(11, total);
    }
}