package dev.alex.leetcode.solution;

import java.util.ArrayList;
import java.util.List;

public class _225 {
    private List<Integer> data;

    public _225() {
        data = new ArrayList<>();
    }

    public void push(int x) {
        int size = data.size();
        data.add(size, x);
    }

    public int pop() {
        int size = data.size();
        int ele = data.get(size - 1);
        data.remove(size - 1);

        return ele;
    }

    public int top() {
        int size = data.size();

        return data.get(size - 1);
    }

    public boolean empty() {
        return data.isEmpty();
    }
}
