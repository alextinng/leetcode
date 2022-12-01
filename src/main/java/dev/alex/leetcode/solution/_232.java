package dev.alex.leetcode.solution;

import java.util.LinkedList;

public class _232 {
    private LinkedList<Integer> data;

    public _232() {
        data = new LinkedList<>();
    }

    public void push(int x) {
        data.addLast(x);
    }

    public int pop() {
        return data.poll();
    }

    public int peek() {
        return data.peek();
    }

    public boolean empty() {
        return data.isEmpty();
    }
}
