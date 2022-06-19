package com.leetcode.medium;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


@RunWith(JUnit4.class)
public class LongestPalindromicSubstringTest extends TestCase {

    LongestPalindromicSubstring longestPalindromicSubstring;

    @Before
    public void setUp() throws Exception {
        longestPalindromicSubstring = new LongestPalindromicSubstring();
    }

    @Test
    public void testLongestPalindrome() {
        longestPalindromicSubstring.longestPalindrome("acaca");
    }
}