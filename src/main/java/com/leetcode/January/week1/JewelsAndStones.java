package com.leetcode.January.week1;

public class JewelsAndStones {
    /*
     jewels = "aA"
     stones = "aAAbbbb"
     3
     */
    public int numJewelsInStones(String jewels, String stones) {
        if (jewels == null || stones == null) {
            return 0;
        }
        var noOfJewels = 0;
        for (int i = 0; i < stones.length(); i++) {
            for (int j = 0; j < jewels.length(); j++) {
                if (stones.charAt(i) == jewels.charAt(j)) {
                    noOfJewels++;
                }
            }
        }
        return noOfJewels;
    }
}
