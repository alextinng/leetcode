package dev.alex.leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class _1 {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        Map<Integer, List<Integer>> dic = new HashMap<>();
        for (int cur = 0; cur < nums.length; cur++) {
            int number = nums[cur];
            if (dic.containsKey(number)) {
                dic.get(number).add(cur);
            } else {
                List<Integer> list = new LinkedList<>();
                list.add(cur);
                dic.put(number, list);
            }
        }

        for (Map.Entry<Integer, List<Integer>> next : dic.entrySet()) {
            int number = next.getKey();
            List<Integer> indices = next.getValue();
            if (dic.containsKey(target - number)) {
                if (target - number == number && dic.get(number).size() > 1) {
                    result[0] = indices.get(0);
                    result[1] = indices.get(1);
                    break;
                } else {
                    result[0] = indices.get(0);
                    result[1] = dic.get(target - number).get(0);
                    break;
                }
            }
        }

        return result;
    }
}
