package com.dsa.linear.arrays.sliding_window;

public class Sliding {

    public static int longestSubArray(int[] nums, int k) {
        int left = 0;
        int sum = 0;
        int longestLength = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum > k) {
                sum -= nums[left];
                left++;
            }
            var len = right - left + 1;
            longestLength = Math.max(longestLength, len);
        }
        return longestLength;
    }

    /*
     * Example 2: You are given a binary string s (a string containing only "0" and "1").
     *  You may choose up to one "0" and flip it to a "1". What is the length of the longest
     *  substring achievable that contains only "1"?
     *  For example, given s = "1101100111", the answer is 5.
     *  If you perform the flip at index 2, the string becomes 1111100111.
     *  */
    public static int longestBinaryWithOne(String text) {
        // constraints:
        // 1: possibility to change one zero to 1
        //  Question
        // longest len with only 1
        int left = 0, ans = 0, zeroCount = 0;

        for (int right = 0; right < text.length(); right++) {
            if (text.charAt(right) == '0') zeroCount++;

            while (zeroCount >= 2) {
                if (text.charAt(left) == '0') zeroCount--;
                left++;
            }
            var windowLen = right - left + 1;
            ans = Math.max(ans, windowLen);
        }
        return ans;
    }

    /*
    * Example 3: 713. Subarray Product Less Than K.
    * Given an array of positive integers nums and an integer k,
    * return the number of subarrays where the product of
    * all the elements in the subarray is strictly less than k.
    * For example, given the input nums = [10, 5, 2, 6], k = 100, the answer is 8.
    * The subarrays with products less than k are:
    *
    * [10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6]
    * */
}
