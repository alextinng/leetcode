package dev.alex.leetcode.solution;

import dev.alex.leetcode.entity.ListNode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 给你两个单链表的头节点 headA 和 headB ，请你找出并返回两个单链表相交的起始节点。如果两个链表不存在相交节点，返回 null 。
 */
public class _160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curA, curB;
        // init
        curA = headA;
        curB = headB;
        Map<ListNode, Integer> referenceCnt = new HashMap<>();
        while (Objects.nonNull(curA)) {
            referenceCnt.put(curA, 1);
            curA = curA.next;
        }

        while (Objects.nonNull(curB)) {
            if (referenceCnt.containsKey(curB)) return curB;
            curB = curB.next;
        }

        return null;
    }
}
