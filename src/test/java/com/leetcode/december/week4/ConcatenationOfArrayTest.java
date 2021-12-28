package com.leetcode.december.week4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ConcatenationOfArrayTest {

    public final ConcatenationOfArray concatenationOfArray = new ConcatenationOfArray();

    @Test
    void testBaseCase() {
        int[] nums = {1, 2, 1};
        int[] actual = concatenationOfArray.getConcatenation(nums);
        int[] expected = {1, 2, 1, 1, 2, 1};
        Assertions.assertArrayEquals(expected, actual);
    }

}
