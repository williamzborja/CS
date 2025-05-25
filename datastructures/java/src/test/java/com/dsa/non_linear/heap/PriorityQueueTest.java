package com.dsa.non_linear.heap;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.PriorityQueue;

import static org.junit.jupiter.api.Assertions.assertEquals;


class PriorityQueueTest {


    @Test
    void testPriorityQueue(){
        var minHeap = new PriorityQueue<>();

        minHeap.addAll(List.of(1, 4, 8, 80));


        assertEquals(1, minHeap.poll());
        assertEquals(4, minHeap.poll());
        assertEquals(8, minHeap.poll());
        assertEquals(80, minHeap.poll());
    }
}
