package com.dsa.linear.arrays.two_pointers;

public class TwoSumSorted {

    private static boolean bruteForce(int[] nums, int target) {
        for (var num : nums) {
            for (var num2 : nums) {
                if (num + num2 == target) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean twoPointers(int[] nums, int target) {
        var left = 0;
        var right = nums.length - 1;

        while (left < right) {
            var sum = nums[left] + nums[right];
            if (sum == target) return true;
            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }

    public static boolean twoSumSorted(int[] nums, int target) {
        return twoPointers(nums, target);
    }
}
