package com.dsa.linear.arrays;

import org.junit.jupiter.api.Test;

import static com.dsa.linear.arrays.sliding_window.Sliding.longestBinaryWithOne;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestBinaryTest {
    @Test
    void testLongestBi() {
        var input = "1101100111";

        var result = longestBinaryWithOne(input);

        assertEquals(5, result);

        input = "11001011";

        result = longestBinaryWithOne(input);

        assertEquals(4, result);
    }
}
