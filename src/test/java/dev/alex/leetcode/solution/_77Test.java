package dev.alex.leetcode.solution;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class _77Test {
    private _77 instance;

    @Before
    public void setUp() throws Exception {
        instance = new _77();
    }

    @Test
    public void combine() {
        System.out.println("case (1,1): ");
        List<List<Integer>> list = instance.combine(1, 1);
        System.out.println("result: " + list);

        System.out.println("case (2,1): ");
        list = instance.combine(2,1);
        System.out.println("result: " + list);

        System.out.println("case (2,2): ");
        list = instance.combine(2,2);
        System.out.println("result: " + list);

        System.out.println("case (3,1): ");
        list = instance.combine(3,1);
        System.out.println("result: " + list);

        System.out.println("case (3,2): ");
        list = instance.combine(3,2);
        System.out.println("result: " + list);

        System.out.println("case (3,3): ");
        list = instance.combine(3,3);
        System.out.println("result: " + list);
    }
}