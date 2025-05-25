package com.dsa.linear.stack;

import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.Deque;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StackTest {


    @Test
    void testStack(){
        var stack = new ArrayDeque<String>();

        stack.push("one");
        stack.push("two");

        assertEquals(2, stack.size());
        assertEquals("two", stack.peek());
        assertEquals("two", stack.pop());
        assertEquals("one", stack.peek());
    }
}
