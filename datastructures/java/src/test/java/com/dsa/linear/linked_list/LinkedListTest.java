package com.dsa.linear.linked_list;

import com.dsa.linear.linked_list.LinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    void testAppend() {
        LinkedList<Integer> nums = new LinkedList<>();
        nums.append(1);
        nums.append(2);
    }


    @Test
    void testAppendAndLen() {
        LinkedList<Integer> nums = new LinkedList<>();

        nums.append(1);
        nums.append(2);

        assertEquals(2, nums.len());
    }

    @Test
    void testAppendMore() {
        LinkedList<Integer> nums = new LinkedList<>();

        nums.append(1);
        nums.append(2);
        nums.append(1);
        nums.append(2);

        assertEquals(4, nums.len());
    }

    @Test
    void testToString() {
        LinkedList<Integer> nums = new LinkedList<>();
        nums.append(1);
        nums.append(2);
        nums.append(3);
        nums.append(4);

        assertEquals("[1, 2, 3, 4]", nums.toString());
    }
}