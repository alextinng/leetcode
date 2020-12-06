package dev.alex.leetcode;

import java.util.*;

public class _13 {
    private final Map<String, Integer> dic = new HashMap<>();

    private final List<String> unit = new ArrayList<>(Arrays.asList("M", "CM", "D", "CD", "C", "XC",
            "L", "XL", "X", "IX", "V", "IV", "I"));

    public _13() {
        dic.put("I", 1);
        dic.put("IV", 4);
        dic.put("V", 5);
        dic.put("IX", 9);
        dic.put("X", 10);
        dic.put("XL", 40);
        dic.put("L", 50);
        dic.put("XC", 90);
        dic.put("C", 100);
        dic.put("CD", 400);
        dic.put("D", 500);
        dic.put("CM", 900);
        dic.put("M", 1000);
    }

    public int romanToInt(String str) {
        int result = 0;

        int size = unit.size();
        while (str.length() > 0) {
            for (int i = 0; i < size; i++) {
                String s = unit.get(i);
                if (str.startsWith(s)) {
                    result += dic.get(s);
                    str = str.substring(s.length());
                    break;
                }
            }

        }

        return result;
    }
}
