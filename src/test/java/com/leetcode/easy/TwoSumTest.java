package com.leetcode.easy;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class TwoSumTest extends TestCase {
    TwoSum twoSum;

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Before
    public void before() {
        twoSum = new TwoSum();
    }

    @Test
    public void twoSumSuccess() {
        int[] aa = twoSum.twoSum(new int[]{2, 7, 11, 15}, 9);
        Assert.assertArrayEquals(new int[]{0, 1}, aa);
    }

    @Test
    public void twoSumFailure() {
        exception.expect(IllegalArgumentException.class);
        twoSum.twoSum(new int[]{2, 7, 11, 15}, 91);
    }
}