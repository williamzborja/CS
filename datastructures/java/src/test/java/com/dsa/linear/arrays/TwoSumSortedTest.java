package com.dsa.linear.arrays;

import org.junit.jupiter.api.Test;

import static com.dsa.linear.arrays.two_pointers.TwoSumSorted.twoSumSorted;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TwoSumSortedTest {

    @Test
    void testTwoSumSortedEasyOK() {
        var nums = new int[]{1, 2, 4, 6, 8, 9, 14, 15};
        var target = 13;

        assertTrue(twoSumSorted(nums, target));
    }


    @Test
    void testTwoSumSortedNonOK() {
        var nums = new int[]{100, 900, 1400, 1500};
        var target = 13;

        assertFalse(twoSumSorted(nums, target));
    }
}
