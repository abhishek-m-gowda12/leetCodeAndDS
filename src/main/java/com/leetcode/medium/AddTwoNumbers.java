package com.leetcode.medium;

import java.util.LinkedList;
import java.util.List;

public class AddTwoNumbers {
    public List addTwoNumbers(List<Integer> l1, List<Integer> l2) {
        List<Integer> linkedList = new LinkedList<>();
        int carry = 0;
        for (int i = 0; i < l1.size(); i++) {
            int l1Info = l1.get(i);
            int l2Info = l2.get(i);
            int sum = l1Info + l2Info;

            sum += carry;
            if (sum > 9) {
                carry = 1;
                sum = sum - 10;
            } else {
                carry = 0;
            }
            linkedList.add(sum);
        }
        return linkedList;
    }
}
