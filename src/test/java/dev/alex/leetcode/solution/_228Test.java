package dev.alex.leetcode.solution;

import junit.framework.TestCase;

import java.util.List;

public class _228Test extends TestCase {
    private _228 instance;

    public void setUp() throws Exception {
        super.setUp();
        instance = new _228();
    }

    public void testSummaryRanges() {
        List<String> strings = instance.summaryRanges(new int[]{2});
        System.out.println(strings);

        strings = instance.summaryRanges(new int[]{2, 3});
        System.out.println(strings);

        strings = instance.summaryRanges(new int[]{2, 4});
        System.out.println(strings);

        strings = instance.summaryRanges(new int[]{0, 1, 2, 3, 5, 9, 10});
        System.out.println(strings);

        strings = instance.summaryRanges(new int[]{-2147483648, -2147483647, 2147483647});
        System.out.println(strings);
    }
}