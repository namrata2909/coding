package com.leetcode.january.week1;

import com.leetcode.January.week1.JewelsAndStones;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class JewelsAndStonesTest {

    private final JewelsAndStones jewelsAndStones = new JewelsAndStones();

    @ParameterizedTest
    @CsvSource(value = {
            "aA:aAAbbbb:3",
            "z:ZZ:0",
            "::0",
            ":asdass:0",
    }, delimiter = ':')
    public void executeTestCase(String jewels, String stones, int ans) {
        Assertions.assertEquals(ans, jewelsAndStones.numJewelsInStones(jewels, stones));
    }

}
