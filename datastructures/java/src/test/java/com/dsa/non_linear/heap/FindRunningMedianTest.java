package com.dsa.non_linear.heap;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.dsa.non_linear.heap.FindRunningMedian.findRunningMedian;

public class FindRunningMedianTest {



    @Test
    void findRunningTest(){
        var nums = List.of(12, 4, 5, 3, 8, 7);

        var result = findRunningMedian(nums);

        System.out.println(result);
    }
}
