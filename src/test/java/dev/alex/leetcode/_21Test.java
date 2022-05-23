package dev.alex.leetcode;

import org.junit.Before;
import org.junit.Test;

public class _21Test {
    private _21 instance;

    @Before
    public void setup() {
        instance = new _21();
    }

    @Test
    public void mergeTwoLists() {
        ListNode list1 = new ListNode(1, new ListNode(5));
        ListNode list2 = new ListNode(2);
        instance.mergeTwoLists(list1, list2);
    }
}