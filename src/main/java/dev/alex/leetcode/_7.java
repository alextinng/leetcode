package dev.alex.leetcode;

class _7 {
    public int reverse(int x) {
        for (long n = 0L; x != 0; x = x / 10) {
            n = n * 10 + x % 10;
            if ((int) n == n && x / 10 == 0) {
                return (int) n;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        _7 instance = new _7();
        System.out.println(instance.reverse(-2147483648));
    }
}

