package com.leetcode.January.week2;

public class SubtractTheProductAndSumOfDigitsOfAnInteger {

    public int subtractProductAndSum(int n) {
        int product = 1;
        int addition = 0;
        boolean isNegative = false;
        if (n < 0) {
            isNegative = true;
            n = -n;
        }
        int lastDigit = 0;
        while (n > 0) {
            lastDigit = n % 10;
            product *= lastDigit;
            addition += lastDigit;
            n = n / 10;
        }
        if (isNegative) {
            product = -product;
            addition = addition - (2 * lastDigit);
        }
        return product - addition;
    }

}



