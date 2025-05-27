package com.dsa.linear.arrays;

import org.junit.jupiter.api.Test;

import java.util.*;

public class BasisTest {

  @Test
  void arrayTest() {
    var nums = new Integer[] { 1, 4, 5, 6 };

    List<Integer> list = Arrays.asList(nums); // T: o(1) , S: O(n)
    list.sort(Comparator.reverseOrder()); // T: o(nlogn) , S: O(1)

    System.out.println(Arrays.toString(nums)); // O(n)

    var min = Collections.min(list); // O(n)
    var max = Collections.max(list); // O(n)

    System.out.println(min);
    System.out.println(max);

    Collections.swap(list, 0, list.size() - 1); // O(1)
    int frequency = Collections.frequency(list, 2); // O(n)
    System.out.println("Frequency of 2: " + frequency);
    System.out.println("List: " + list);
  }

  @Test
  void setFromArrayTest() {
    var nums = List.of(4, 4, 6, 8, 2, 3, 5, 23, 2, 1, 5, 7, 8, 89, 3, 2);
    Set<Integer> set = new HashSet<>(nums);

    set.forEach(System.out::println);
  }

  @Test
  void testGrouping() {
    List<String> words = List.of("bat", "tab", "cat", "act");

    Map<String, List<String>> groups = new HashMap<>();

    for (String word : words) {
      char[] chars = word.toCharArray();
      Arrays.sort(chars);
      String key = new String(chars);

    }
  }
}
