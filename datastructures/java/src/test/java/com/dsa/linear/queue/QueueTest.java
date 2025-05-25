package com.dsa.linear.queue;

import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class QueueTest {
    @Test
    void queueTest(){
        Queue<String> queue = new ArrayDeque<>();

        queue.add("one");
        queue.add("two");

        assertEquals("one", queue.peek());
        assertEquals("one", queue.remove());
        assertEquals("two", queue.peek());
        assertEquals("two", queue.remove());
        assertNull(queue.peek());
        assertEquals(0, queue.size());
    }
}
