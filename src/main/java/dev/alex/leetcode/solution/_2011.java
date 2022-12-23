package dev.alex.leetcode.solution;

public class _2011 {
    public int finalValueAfterOperations(String[] operations) {
        return backtracking(0, operations, 0);
    }

    private int backtracking(int result, String[] operations, int i) {
        if (i < operations.length) {
            String operation = operations[i];
            System.out.println("current operation: " + operation);
            switch (operation) {
                case "++X":
                case "X++":
                    result++;
                    break;
                default:
                    result--;
                    break;
            }

            return backtracking(result, operations, i + 1);
        } else {
            return result;
        }
    }
}
