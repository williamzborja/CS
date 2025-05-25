package com.dsa.linear.arrays.two_pointers;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CombineSorted {

    private static int[] naive(int[] nums1, int[] nums2) {
        return IntStream
                .concat(Arrays.stream(nums1), Arrays.stream(nums2))
                .sorted()
                .toArray();
    }

    //              /
    // nums1 {1, 4  5} -> length 3
    // nums2 {2, 6, 7 } -> length 3
    //           /
    // result {1, 2, 4, 5, 6 ,7 }
    private static int[] twoPointers(int[] nums1, int[] nums2) {
        var answer = new int[nums1.length + nums2.length];
        var i = 0;
        var index_1 = 0;
        var index_2 = 0;

        while (index_1 < nums1.length && index_2 < nums2.length) {
            if (nums1[index_1] <= nums2[index_2]) {
                answer[i] = nums1[index_1];
                index_1++;
            } else {
                answer[i] = nums2[index_2];
                index_2++;
            }
            i++;
        }

        while (index_1 < nums1.length) {
            answer[i++] = nums1[index_1++];
        }
        while (index_2 < nums2.length) {
            answer[i++] = nums2[index_2++];
        }
        return answer;
    }

    public static int[] combineSorted(int[] nums1, int[] nums2) {
        return twoPointers(nums1, nums2);
    }
}
