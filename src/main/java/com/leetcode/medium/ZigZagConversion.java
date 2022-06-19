package com.leetcode.medium;

public class ZigZagConversion {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;

        char[] newString = new char[s.length()];
        int bPipes = (numRows - 1) * 2;
        int k = 0;

        for (int i = 0; i < numRows; i++) {
            for (int j = i; j < s.length(); j += bPipes) {

                newString[k++] = s.charAt(j);

                if (i > 0 && i < numRows - 1 && j + bPipes - 2 * i < s.length())
                    newString[k++] = s.charAt(j + bPipes - 2 * i);
            }
        }
        return new String(newString);
    }

}
