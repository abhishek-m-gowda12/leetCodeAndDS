package com.leetcode.medium;

import com.leetcode.easy.TwoSum;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class LongestSubstringWithoutRepeatingCharactersTest extends TestCase {

    LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters;

    @Before
    public void before() {
        longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
    }

    @Test
    public void testLengthOfLongestSubstring() {
        int aa = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcabcbb");
        Assert.assertEquals(3, aa);
    }
}