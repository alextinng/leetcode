package dev.alex.leetcode.solution;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class _784Test {
    private _784 instance;

    @Before
    public void setUp() throws Exception {
        instance = new _784();
    }

    @Test
    public void letterCasePermutation() {
        System.out.println("case 1: ");
        List<String> list = instance.letterCasePermutation("a");
        System.out.println(list);

        System.out.println("case 2: ");
        list = instance.letterCasePermutation("a1");
        System.out.println(list);

        System.out.println("case 3: ");
        list = instance.letterCasePermutation("ab");
        System.out.println(list);

        System.out.println("case 3: ");
        list = instance.letterCasePermutation("C");
        System.out.println(list);

        System.out.println("case 4: ");
        list = instance.letterCasePermutation("1b");
        System.out.println(list);
    }
}