package com.dsa.linear.arrays.two_pointers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Subsequence {

    private static final Map<Character, List<Integer>> seen = new HashMap<>();

    // naive
    private static boolean naive(String text1, String text2) {
        return text2.contains(text1);
    }

    // 2p
    private static boolean twoPointers(String text1, String text2) {
        if (text1.length() > text2.length()) return false;
        if (text1.length() == text2.length() && !text1.equals(text2)) return false;

        int si = 0, ti = 0;

        while (si < text1.length() && ti < text2.length()) {
            if (text1.charAt(si) == text2.charAt(ti)) {
                si++;
            }
            ti++;
        }

        return si == text1.length();
    }

    public static boolean isSubsequence(String text1, String text2) {
        return twoPointers(text1, text2);
    }


    private static void preprocessing(String target) {
        var array = target.toCharArray();
        for (int i = 0; i < target.length(); i++) {
            if (!seen.containsKey(array[i])) {
                seen.put(array[i], new ArrayList<>(List.of(i)));
            }else {
                seen.get(array[i]).add(i);
            }
        }
    }

    public static boolean isSubsequenceMultiple(String text1, String text2) {
        return twoPointers(text1, text2);
    }
}
