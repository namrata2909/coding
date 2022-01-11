package com.leetcode.january.week2;

import com.leetcode.January.week2.SubtractTheProductAndSumOfDigitsOfAnInteger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SubtractTheProductAndSumOfDigitsOfAnIntegerTest {

    private final SubtractTheProductAndSumOfDigitsOfAnInteger s = new SubtractTheProductAndSumOfDigitsOfAnInteger();

    static Stream<Arguments> getTestCases() {
        return Stream.of(
                Arguments.of(234, 15),
                Arguments.of(-4421, -35)
        );
    }

    @ParameterizedTest
    @MethodSource(value = "getTestCases")
    public void testPositive(int n, int ans) {
        Assertions.assertEquals(ans, s.subtractProductAndSum(n));
    }

}



