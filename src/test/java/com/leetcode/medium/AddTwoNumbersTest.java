package com.leetcode.medium;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.List;

@RunWith(JUnit4.class)
public class AddTwoNumbersTest extends TestCase {

    AddTwoNumbers addTwoNumbers;

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Before
    public void before() {
        addTwoNumbers = new AddTwoNumbers();
    }

    @Test
    public void twoSumSuccess() {
        List aa = addTwoNumbers.addTwoNumbers(Arrays.asList(1,5,8),Arrays.asList(1,5,8));
        Assert.assertArrayEquals(Arrays.asList(2,0,7).toArray(), aa.toArray());
    }
}