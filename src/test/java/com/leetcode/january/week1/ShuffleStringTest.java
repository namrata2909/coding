package com.leetcode.january.week1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

 class ShuffleStringTest {

     private final ShuffleString shuffleString = new ShuffleString();

     private static Stream<Arguments> getArguments() {
         return Stream.of(
                 Arguments.of("codeleet", new int[]{4, 5, 6, 7, 0, 2, 1, 3}, "leetcode"),
                 Arguments.of("abc", new int[]{0, 1, 2}, "abc"),
                 Arguments.of(null, null, null)
         );
     }

     @ParameterizedTest
     @MethodSource(value = "getArguments")
     void executeTestCase(String s, int[] indices, String ans) {
         Assertions.assertEquals(ans, shuffleString.restoreString(s, indices));
     }

 }
