package dev.alex.leetcode.solution;

import java.util.Arrays;

public class _167 {
    public int[] twoSum(int[] numbers, int target) {
        return solution3(numbers, target);
    }

    private int[] solution1(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                System.out.printf("i: %d, j: %d, sum: %d%n", i, j, sum);

                if (sum == target) return new int[]{i, j};
                else if (sum > target) {
                    break;
                }
            }
        }

        return new int[]{};
    }

    private int[] solution2(int[] numbers, int target) {
        for (int i = 0, j = numbers.length - 1; i < j; ) {
            int sum = numbers[i] + numbers[j];
            System.out.printf("i: %d, j: %d, sum: %d%n", i, j, sum);

            if (sum == target) return new int[]{i + 1, j + 1};
            else if (sum > target) j--;
            else i++;
        }
        return null;
    }

    private int[] solution3(int[] numbers, int target) {
        System.out.println("nums: " + Arrays.toString(numbers));
        int t = numbers.length;
        for (int i = 0; i < t; i++) {
            for (int j = t - 1; j > i; j--) {
                int sum = numbers[i] + numbers[j];
                System.out.printf("i: %d, j: %d, sum: %d%n", i, j, sum);

                if (sum == target) return new int[]{i + 1, j + 1};
                if (sum > target) t--;
                if (sum < target) break;
            }
        }

        return new int[]{};
    }
}
