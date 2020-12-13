package dev.alex.leetcode;

public class _1114 {
    private final Object lock = new Object();
    private int signal;

    public _1114() {
        signal = 2;
    }

    public void first(Runnable printFirst) throws InterruptedException {
        for (; ; ) {
            synchronized (lock) {
                if (signal == 2) {
                    signal--;
                    // printFirst.run() outputs "first". Do not change or remove this line.
                    printFirst.run();
                    break;
                }
            }
        }
    }

    public void second(Runnable printSecond) throws InterruptedException {
        for (; ; ) {
            synchronized (lock) {
                if (signal == 1) {
                    signal--;

                    // printSecond.run() outputs "second". Do not change or remove this line.
                    printSecond.run();
                    break;
                }
            }
        }

    }

    public void third(Runnable printThird) throws InterruptedException {
        for (; ; ) {
            synchronized (lock) {
                if (signal == 0) {
                    signal--;

                    // printThird.run() outputs "third". Do not change or remove this line.
                    printThird.run();
                    break;
                }
            }
        }

    }
}
