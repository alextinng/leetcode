package dev.alex.leetcode.solution;

import java.util.ArrayList;
import java.util.List;

public class _784 {
    public List<String> letterCasePermutation(String s) {
        List<String> result = new ArrayList<>();

        char ch = s.charAt(0);
        char changed = Character.isLowerCase(ch) ? Character.toUpperCase(ch) : Character.toLowerCase(ch);
        if (s.length() < 2) {
            result.add(s);
            if (Character.isLetter(ch)) {
                result.add(String.valueOf(changed));
            }
        } else {
            List<String> list = letterCasePermutation(s.substring(1));
            System.out.println("list: " + list);
            for (String each : list) {
                result.add(String.format("%s%s", ch, each));
                if (Character.isLetter(ch)) {
                    result.add(String.format("%s%s", changed, each));
                }
            }
        }

        return result;
    }
}
