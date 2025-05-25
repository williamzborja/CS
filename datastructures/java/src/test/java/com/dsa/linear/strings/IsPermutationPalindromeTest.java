package com.dsa.linear.strings;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IsPermutationPalindromeTest {


    private static boolean isPermutationPalindrome(String text ){
        var freq = new HashMap<Character, Integer>();
        // fill map
        for (var c: text.toCharArray()) {
            freq.merge(c, 1, Integer::sum);
        }

        var oddCounter = 0;
        for (var value: freq.values()) {
           if (value % 2 == 1) {
               oddCounter += 1;
           }
           if (oddCounter == 2) {
               return false;
           }
        }
        return true;
    }



    @Test
    void testIsPermutationPalindrome(){
        List<String> texts = List.of("aabb", "racecar", "raceeecar", "aabbcd");


        boolean is = isPermutationPalindrome(texts.getFirst());
        assertTrue(is);

        is = isPermutationPalindrome(texts.get(1));
        assertTrue(is);

        is = isPermutationPalindrome(texts.get(2));
        assertTrue(is);

        is = isPermutationPalindrome(texts.get(3));
        assertFalse(is);
    }
}
