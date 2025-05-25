package com.dsa.linear.strings;

public class Palindrome {

    public static boolean naive(String word) {
        var reversed = new StringBuilder(word).reverse().toString();
        return word.equals(reversed);
    }

    public static boolean twoPointers(String word) {
        int left = 0, right = word.length() - 1;
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindrome(String word) {
        word = word.toLowerCase().replaceAll("\\s", "");
        return twoPointers(word);
    }


    public static String longestPalindrome(String text) {
        int n = text.length();
        String longest = "";

        for (int left = 0; left < n; left++) {
            for (int right = left + 1; right <= n; right++) {
                String substr = text.substring(left, right);
                if (isPalindrome(substr) && substr.length() > longest.length()) {
                    longest = substr;
                }
            }
        }

        return longest;
    }
}
