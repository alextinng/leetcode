package dev.alex.leetcode.solution;

import com.google.gson.Gson;

public class _66 {
    public int[] plusOne(int[] digits) {
        int step = 0;
        int length = digits.length;

        int[] cache = new int[length + 1];
        System.arraycopy(digits, 0, cache, 1, length);

        for (int i = length; i >= 0; i--) {
            int num = cache[i] + step;
            if (i == length) {
                num += 1;
            }
            if (step > 0) step = 0;
            if (num > 9) {
                step = 1;
                cache[i] = num % 10;
            } else {
                cache[i] = num;
            }
        }

        System.out.println(new Gson().toJson(cache));

        if (cache[0] > 0) {
            return cache;
        } else {
            int[] arr = new int[length];
            System.arraycopy(cache, 1, arr, 0, length);
            return arr;
        }
    }
}
