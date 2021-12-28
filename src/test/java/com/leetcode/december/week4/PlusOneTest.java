package com.leetcode.december.week4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PlusOneTest {

    public final PlusOne plusOne = new PlusOne();

    @Test
    void testSimpleCase() {
        int[] digits = {1, 2, 3};
        int[] actual = plusOne.plusOne(digits);
        int[] expected = {1, 2, 4};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void testEdgeCase() {
        int[] digits = {9, 9, 9};
        int[] actual = plusOne.plusOne(digits);
        int[] expected = {1, 0, 0, 0};
        Assertions.assertArrayEquals(expected, actual);
    }

}