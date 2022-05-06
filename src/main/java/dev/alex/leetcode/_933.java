package dev.alex.leetcode;

import com.google.gson.Gson;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class _933 {
    private Queue<Integer> queue;

    public _933() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        queue.add(t);
        System.out.println("current time => " + t);
        System.out.println("queue => " + new Gson().toJson(queue));
        for (Integer head = queue.peek(); Objects.nonNull(head) && head + 3000 < t; head = queue.peek()) {
            System.out.println("head => " + head);
            queue.remove();
            System.out.println("after remove, queue => " + new Gson().toJson(queue));
        }

        return queue.size();
    }
}
