package dev.alex.leetcode.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class _401 {
    private String[][] mDic = new String[6][20];
    private String[][] hDic = new String[6][20];

    public _401() {
        mDic[0] = new String[]{"00"};
        mDic[1] = new String[]{"01", "02", "04", "08", "16", "32"};
        mDic[2] = new String[]{"03", "05", "06", "09", "10", "12", "17", "18", "20", "24",
                "33", "34", "36", "40", "48"};
        mDic[3] = new String[]{"07", "11", "13", "14", "19", "21", "22", "25", "26",
                "28", "35", "37", "38", "41", "42", "44", "49", "50", "52", "56"};
        mDic[4] = new String[]{"15", "23", "27", "29", "30", "39", "43", "45", "46",
                "51", "53", "54", "57", "58"};
        mDic[5] = new String[]{"31", "47", "55", "59"};

        hDic[0] = new String[]{"0"};
        hDic[1] = new String[]{"1", "2", "4", "8"};
        hDic[2] = new String[]{"3", "5", "9", "6", "10"};
        hDic[3] = new String[]{"7", "11"};
    }

    public List<String> readBinaryWatch(int turnedOn) {
        if (turnedOn == 0) return Collections.singletonList("0:00");

        List<String> result = new ArrayList<>();
        for (int h = 0; h <= 4 && h <= turnedOn; h++) {
            int m = turnedOn - h;
            if (m <= 5) {
                String[] hours = hDic[h];
                String[] minutes = mDic[m];

                System.out.println("hours: " + Arrays.toString(hours));
                System.out.println("minutes: " + Arrays.toString(minutes));
                for (String hour : hours) {
                    for (String minute : minutes) {
                        if (Objects.nonNull(hour) && Objects.nonNull(minute))
                            result.add(String.format("%s:%s", hour, minute));
                    }
                }
            }
        }

        return result;
    }
}
