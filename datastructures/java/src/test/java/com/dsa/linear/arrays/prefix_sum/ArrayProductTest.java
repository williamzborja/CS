package com.dsa.linear.arrays.prefix_sum;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.dsa.linear.arrays.prefix_sum.ArrayProduct.computeProductExceptSelf;
import static org.junit.jupiter.api.Assertions.*;

class ArrayProductTest {

    @Test
    void testComputeProductExceptSelf() {
        int[] test1 = {1, 2, 3, 4}; // -> [24, 12, 8, 6]
        System.out.println("Para " + Arrays.toString(test1) + ": " + Arrays.toString(computeProductExceptSelf(test1)));

        int[] test2 = {1, 1, 1};   // -> [1, 1, 1]
        System.out.println("Para " + Arrays.toString(test2) + ": " + Arrays.toString(computeProductExceptSelf(test2)));

        int[] test3 = {1, 0, 1};   // -> [0, 1, 0]
        System.out.println("Para " + Arrays.toString(test3) + ": " + Arrays.toString(computeProductExceptSelf(test3)));

        int[] test4 = {1, 0, 0};   // -> [0, 0, 0]
        System.out.println("Para " + Arrays.toString(test4) + ": " + Arrays.toString(computeProductExceptSelf(test4)));

        int[] test5 = {0, 0, 1, 0}; // -> [0, 0, 0, 0]
        System.out.println("Para " + Arrays.toString(test5) + ": " + Arrays.toString(computeProductExceptSelf(test5)));

        int[] test6 = {1, 2, 0, 3, 4}; // -> [0, 0, 24, 0, 0]
        System.out.println("Para " + Arrays.toString(test6) + ": " + Arrays.toString(computeProductExceptSelf(test6)));

        int[] test7 = {}; // Arreglo vacío
        System.out.println("Para " + Arrays.toString(test7) + ": " + Arrays.toString(computeProductExceptSelf(test7)));

        int[] test8 = {5}; // Un solo elemento
        System.out.println("Para " + Arrays.toString(test8) + ": " + Arrays.toString(computeProductExceptSelf(test8))); // Esperado: [1] (producto de "nada" a la izq y "nada" a la der)

    }
}