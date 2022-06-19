package com.leetcode.hard;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;

@RunWith(JUnit4.class)
public class MedianOfTwoSortedArraysTest extends TestCase {

    MedianOfTwoSortedArrays medianOfTwoSortedArrays;

    @Before
    public void setUp() throws Exception {
        medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();
    }

    @Test
    public void testFindMedianSortedArrays() {
        Double ans = medianOfTwoSortedArrays.findMedianSortedArrays(Arrays.asList(1, 2), Arrays.asList(3));
        Assert.assertEquals((Object) 3.0, (Object) ans);
    }
}