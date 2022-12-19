package dev.alex.leetcode.solution;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class _46Test {
    private _46 instance;

    @Before
    public void setUp() throws Exception {
        instance = new _46();
    }

    @Test
    public void permute() {
        List<List<Integer>> permute = instance.permute(new int[]{2});
        System.out.println(permute);

        permute = instance.permute(new int[]{2, 4});
        System.out.println(permute);

        permute = instance.permute(new int[]{2, 4, 5});
        System.out.println(permute);
    }
}