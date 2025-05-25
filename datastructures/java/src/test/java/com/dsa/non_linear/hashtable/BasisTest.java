package com.dsa.non_linear.hashtable;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class BasisTest {


    @Test
    void hashTest() {
        var text = "william";
        var map = new HashMap<Character, Integer>();

        for (var c : text.toCharArray()) {
            map.merge(c, 1, Integer::sum);
        }
        System.out.println(map);
    }

    @Test
    void indexTest() {
        var text = "william";
        var map = new HashMap<Integer, Character>();

        var i = 0;
        for (var c : text.toCharArray()) {
            map.put(i++, c);
        }
        System.out.println(map);
    }

    @Test
    void streamTest(){
        int[] nums = {1, 2, 3};
        Map<Integer, Integer> map = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toMap(x -> x, x -> x)); // ejemplo: valor → valor*2

        System.out.println(map);
    }
}
