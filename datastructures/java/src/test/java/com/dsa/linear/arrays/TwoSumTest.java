package com.dsa.linear.arrays;

import org.junit.jupiter.api.Test;

import static com.dsa.linear.arrays.two_pointers.TwoSum.twoSum;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumTest {


    @Test
    void testTwoSumOK() {
        var nums = new int[]{2, 7, 11, 15};
        var target = 9;

        var result = twoSum(nums, target);
        var expected = new int[]{0, 1};
        assertArrayEquals(expected, result);
    }


    @Test
    void testTwoSumBad() {
        var nums = new int[]{2, 1, 11, 15};
        var target = 9;

        var result = twoSum(nums, target);
        var expected = new int[]{-1, -1};
        assertArrayEquals(expected, result);
    }
}
