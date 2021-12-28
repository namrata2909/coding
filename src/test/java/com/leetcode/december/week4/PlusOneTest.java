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

    @Test
    void testRandomCase() {
        int[] digits = {4, 3, 2, 1};
        int[] actual = plusOne.plusOne(digits);
        int[] expected = {4, 3, 2, 2};
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    void testRandomCase2() {
        int[] digits = {0, 1, 2};
        int[] actual = plusOne.plusOne(digits);
        int[] expected = {0, 1, 3};
        Assertions.assertArrayEquals(expected, actual);
    }

}
