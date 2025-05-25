package com.dsa.linear.linked_list;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReversedTest {
    @Test
    void testReversed(){
        var expected = new java.util.LinkedList<>(List.of(1, 2, 3, 4)).reversed();

        LinkedList<Integer> nums = new LinkedList<>();
        nums.append(1);
        nums.append(2);
        nums.append(3);
        nums.append(4);
        assertEquals("[1, 2, 3, 4]", nums.toString());

        nums.reversed();

        assertEquals(expected.toString(), nums.toString());
    }
}
