package com.leetcode.january.week1;

public class ShuffleString {
    public String restoreString(String s, int[] indices) {
        if (s == null || indices == null) {
            return null;
        }
        /*
        Wrong: first index pe kya rakhna hai
        String shuffleString = "";
        for (int i : indices) {
            shuffleString += s.charAt(i);
        }
        return shuffleString;
        */
        // c ko kis index pe rakhna hai -> correct
        char[] ans = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ans[indices[i]] = s.charAt(i);
        }
        return new String(ans);
    }
}
