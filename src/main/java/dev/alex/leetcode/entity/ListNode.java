package dev.alex.leetcode.entity;

import java.util.Objects;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return String.valueOf(val) + ", next => " + (Objects.nonNull(next) ? next.val : "null");
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }
}
