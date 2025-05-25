package com.dsa.non_linear.hashtable;

import java.util.HashMap;
import java.util.Map;

public class Count {


    public Map<String, Integer> countWords(String text) {
        Map<String, Integer> map = new HashMap<>();

        var words = text.split("\\s+");

        for (var word : words) {
           map.merge(word, 1, Integer::sum);
        }

        return map;
    }
}
