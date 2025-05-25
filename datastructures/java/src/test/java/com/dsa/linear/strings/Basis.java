package com.dsa.linear.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Basis {
    @Test
    void testStringLength(){
        var name = "william";
        assertEquals(7, name.length());
    }

    @Test
    void testTraverse(){
        var name = "william";

        for (int i = 0; i < name.length() ; i++) {
            System.out.println(name.charAt(i));
        }

        for (var c: name.toCharArray()) {
            System.out.println(c);
        }
    }

    @Test
    void testSubstring(){
        var name = "william";

        var substring1= name.substring(1);
        assertEquals("illiam", substring1);

        substring1 = name.substring(1, 3);

        assertEquals("il", substring1);
    }

    @Test
    void testEquals(){
        var name = "william";
        var nameCapitalized = "William";


        assertFalse(name.equals(nameCapitalized));

        assertTrue(name.equalsIgnoreCase(nameCapitalized));
    }

    @Test
    void testIndex(){
        var name = "william";


        assertEquals(1, name.indexOf("i"));
        assertEquals(4, name.lastIndexOf("i"));
    }


    @Test
    void testSuffixPrefix(){
        var name = "william";

        var sb = new StringBuilder(name).reverse();

        assertTrue(name.startsWith("wil"));

    }
}
