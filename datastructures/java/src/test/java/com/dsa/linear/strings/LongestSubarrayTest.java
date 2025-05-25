package com.dsa.linear.strings;

import com.dsa.linear.arrays.sliding_window.Sliding;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubarrayTest {


    @Test
    void testLongest() {
        var nums = new int[]{3, 1, 2, 7, 4, 2, 1, 1, 5};
        var result = Sliding.longestSubArray(nums, 8);

        assertEquals(4, result);
    }
}
