package com.leetcode.december.week4;

public class ConcatenationOfArray {

    public int[] getConcatenation(int[] nums) {
        int oldLen = nums.length;
        int newLen  = 2 * oldLen;
        int[] ans = new int[newLen];
        for (int i = 0; i < newLen; i++) {
            ans[i] = nums[i%oldLen];
        }
        return ans;
    }

}
