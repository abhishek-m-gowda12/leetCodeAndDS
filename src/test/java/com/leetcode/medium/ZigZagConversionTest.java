package com.leetcode.medium;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ZigZagConversionTest extends TestCase {

    ZigZagConversion zigZagConversion;

    @Before
    public void setUp() throws Exception {
        zigZagConversion = new ZigZagConversion();
    }

    @Test
    public void testConvert() {
        String aa = zigZagConversion.convert("PAYPALISHIRING", 3);
        Assert.assertEquals("PAHNAPLSIIGYIR",aa);
    }
}