package com.dsa.linear.strings;

import org.junit.jupiter.api.Test;

import static com.dsa.linear.arrays.two_pointers.Subsequence.isSubsequence;
import static org.junit.jupiter.api.Assertions.*;

class SubsequenceTest {

    @Test
    void testIsSubsequenceOK() {
        String t1 = "william";
        String t2 = "The conquer of scotland was william wallace";

        assertTrue(isSubsequence(t1, t2));
    }


    @Test
    void testIsSubsequenceBAD() {
        String t1 = "william";
        String t2 = "The conquer of scotland was wallace";

        assertFalse(isSubsequence(t1, t2));
    }


    @Test
    void testIsSubsequenceMultipleOk() {
        String t1 = "william";
        String t2 = "The conquer of scotland was wallace";

        assertFalse(isSubsequence(t1, t2));
    }

}