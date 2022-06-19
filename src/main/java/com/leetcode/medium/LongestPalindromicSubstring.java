package com.leetcode.medium;

public class LongestPalindromicSubstring {

    // go to particular char and check if adjacent char are same

    public String longestPalindrome(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            String left = max_palindrome(s, i, i, s.length());
            String right = max_palindrome(s, i, i + 1, s.length());
            String temp = (left.length() > right.length()) ? left : right;
            result = (result.length() > temp.length()) ? result : temp;
        }
        return result;
    }

    public String max_palindrome(String s, int left, int right, int size) {
        while (left >= 0 && right < size && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}
