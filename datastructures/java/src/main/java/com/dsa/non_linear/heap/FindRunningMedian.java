package com.dsa.non_linear.heap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class FindRunningMedian {

    private static Double getMedian(List<Integer> numbers) {

        if (numbers.size() % 2 == 1) {
            var midIndex = (int) Math.floor((numbers.size() - 1) / 2.0);

            return numbers.get(midIndex).doubleValue();
        }
        var left = (numbers.size() - 1) / 2;
        var right = left + 1;
        return (numbers.get(left) + numbers.get(right)) / 2.0;
    }

    private static void rebalance(PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers) {
        var smaller = lowers.size() < highers.size() ? lowers : highers;
        var bigger = lowers.size() < highers.size() ? highers : lowers;

        if (bigger.size() - smaller.size() >= 2) {
            smaller.add(bigger.poll());
        }
    }

    public static List<Double> getMedians(List<Integer> nums) {
        var lowers = new PriorityQueue<Integer>(Comparator.reverseOrder());
        var highers = new PriorityQueue<Integer>();

        List<Double> medians = new ArrayList<>(nums.size()) ;

        for (Integer num : nums) {
            addNumber(num, lowers, highers);
            rebalance(lowers, highers);
            var median = getMedian(lowers, highers);
            medians.add(median);
        }

        return medians;
    }

    private static double getMedian(PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers) {
        var smaller = lowers.size() < highers.size() ? lowers : highers;
        var bigger = lowers.size() < highers.size() ? highers : lowers;

        if (bigger.size() == smaller.size()) {
            return ((double) bigger.peek() + smaller.peek()) / 2.0;
        } else {
            return bigger.peek();
        }
    }


    private static void addNumber(Integer num, PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers) {
        if (lowers.isEmpty() || num < lowers.peek()) {
            lowers.add(num);
        } else {
            highers.add(num);
        }
    }


    private static List<Double> naive(List<Integer> nums) {
        var tmp = new ArrayList<Integer>();
        var result = new ArrayList<Double>();

        for (var num : nums) {
            tmp.add(num);
            tmp.sort(Comparator.naturalOrder());

            var median = getMedian(tmp);
            result.add(median);
        }
        return result;
    }

    public static List<Double> findRunningMedian(List<Integer> nums) {
        return getMedians(nums);
    }
}
