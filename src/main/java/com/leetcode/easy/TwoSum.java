package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> valuesMap = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int targetValue = target - numbers[i];
            if (valuesMap.containsKey(targetValue)) {
                return new int[]{valuesMap.get(targetValue), i};
            }
            valuesMap.put(numbers[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
