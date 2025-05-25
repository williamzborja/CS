package com.dsa.non_linear.heap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinHeapTest {


    @Test
    void testMinHeap() {
        var minHeap = new MinHeap();

        minHeap.add(20);
        minHeap.add(10);
        minHeap.add(17);
        minHeap.add(25);
        minHeap.add(15);

        System.out.println(minHeap);

        var min = minHeap.peek();

        assertEquals(10, min);

        min = minHeap.poll();
        assertEquals(10, min);

        min = minHeap.poll();
        assertEquals(15, min);

        minHeap.add(18);
        minHeap.add(1);
        minHeap.add(4);

        min = minHeap.poll();
        assertEquals(1, min);

        min = minHeap.poll();
        assertEquals(4, min);


        min = minHeap.poll();
        assertEquals(17, min);


        min = minHeap.poll();
        assertEquals(18, min);

        min = minHeap.poll();
        assertEquals(20, min);

        min = minHeap.poll();
        assertEquals(25, min);
    }
}
