package com.dsa.linear.arrays;

import org.junit.jupiter.api.Test;

import static com.dsa.linear.arrays.two_pointers.CombineSorted.combineSorted;
import static org.junit.jupiter.api.Assertions.*;

class CombineSortedTest {
    @Test
    void testCombine() {
        var nums1 = new int[]{1, 4, 7, 20};
        var nums2 = new int[]{3, 5, 6};

        var result = combineSorted(nums1, nums2);

        assertArrayEquals(new int[]{1, 3, 4, 5, 6, 7, 20}, result);
    }

    @Test
    void testNegativeCombine() {
        var nums1 = new int[]{-1, 1, 4};
        var nums2 = new int[]{3, 5};

        var result = combineSorted(nums1, nums2);

        assertArrayEquals(new int[]{-1, 1, 3, 4, 5}, result);
    }
}