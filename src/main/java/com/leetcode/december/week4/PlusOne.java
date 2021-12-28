package com.leetcode.december.week4;

class PlusOne {

    public int[] plusOne(int[] digits) {
        boolean hasCarry = false;
        int len = digits.length;
        digits[len - 1]++;
        if (digits[len - 1] > 9) {
            hasCarry = true;
            digits[len - 1] = 0;
        }
        for (int i = len - 2; i > -1; i--) {
            if (hasCarry) {
                digits[i]++;
                if (digits[i] > 9) {
                    digits[i] = 0;
                } else {
                    hasCarry = false;
                }
            }
        }
        if (hasCarry) {
            int[] ans = new int[len + 1];
            ans[0] = 1;
            System.arraycopy(digits, 0, ans, 1, len);
            return ans;
        }
        return digits;
    }
}