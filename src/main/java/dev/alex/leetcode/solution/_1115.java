package dev.alex.leetcode.solution;

import java.util.concurrent.Semaphore;

public class _1115 {
    private Semaphore foo = new Semaphore(1);
    private Semaphore bar = new Semaphore(0);

    private int n;

    public _1115(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            foo.acquire();
            // printFoo.run() outputs "foo". Do not change or remove this line.
            printFoo.run();
            bar.release();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            bar.acquire();
            // printBar.run() outputs "bar". Do not change or remove this line.
            printBar.run();
            foo.release();

        }
    }
}
