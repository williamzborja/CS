package com.dsa.linear.strings;

import org.junit.jupiter.api.Test;

import static com.dsa.linear.strings.Palindrome.isPalindrome;
import static com.dsa.linear.strings.Palindrome.longestPalindrome;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTest {

    @Test
    void testIsPalindromeWithSpaces() {
        var word = "A man a plan a canal Panama";

        var result = isPalindrome(word);

        assertTrue(result);
    }

    @Test
    void testIsPalindromeValid() {
        var word = "racecar";

        var result = isPalindrome(word);

        assertTrue(result);
    }


    @Test
    void testIsPalindromeNonValid() {
        var word = "william";

        var result = isPalindrome(word);

        assertFalse(result);
    }

    @Test
    void testLongestPalindrome() {
        var input = "babad";

        var result = longestPalindrome(input);

        assertEquals("bab", result);
    }
}
