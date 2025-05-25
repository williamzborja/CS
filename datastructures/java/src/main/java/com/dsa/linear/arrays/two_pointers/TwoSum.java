package com.dsa.linear.arrays.two_pointers;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {


    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        var i = 0;

        for (var num : nums) {
            var x = target - num;
            if (seen.containsKey(x)) {
                return new int[]{seen.get(x), i};
            }
            seen.put(num, i);
            i++;
        }

        return new int[]{-1, -1};
    }
}
