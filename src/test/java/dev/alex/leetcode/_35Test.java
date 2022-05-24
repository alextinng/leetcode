package dev.alex.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class _35Test {
    private _35 instance;

    @Before
    public void setup() {
        instance = new _35();
    }

    @Test
    public void testSearchInsert() {
//        {
//            int[] nums = {1, 3, 6, 8, 9};
//            int offset = instance.searchInsert(nums, 8);
//            Assert.assertEquals(3, offset);
//        }

        {
            int[] nums = {1, 3, 5, 7, 9, 11};
            int offset = instance.searchInsert(nums, 5);
            Assert.assertEquals(2, offset);
        }
    }
}