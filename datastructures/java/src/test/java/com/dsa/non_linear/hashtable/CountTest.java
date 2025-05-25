package com.dsa.non_linear.hashtable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountTest {

    @Test
    void countWords() {
        var text = """
                java stream lambda code chatgpt java code lambda java java java
                """;
        var count = new Count();
        var result = count.countWords(text);

        assertEquals(5, result.get("java"));
    }
}