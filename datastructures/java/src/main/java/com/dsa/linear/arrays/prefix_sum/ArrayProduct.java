package com.dsa.linear.arrays.prefix_sum;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayProduct {

    public static int[] computeProductExceptSelf(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }

        int n = nums.length;
        int[] result = new int[n];

        // Primera pasada: Calcular productos de la izquierda
        // result[i] contendrá el producto de todos los elementos a la izquierda de nums[i]
        int prefixProduct = 1;
        for (int i = 0; i < n; i++) {
            result[i] = prefixProduct;
            prefixProduct *= nums[i];
        }

        // Segunda pasada: Calcular productos de la derecha y multiplicar
        // suffixProduct contendrá el producto de todos los elementos a la derecha de nums[i]
        // Se multiplica con el prefixProduct ya almacenado en result[i]
        int suffixProduct = 1;
        int[] suffix = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            suffix[i] = suffixProduct;
            result[i] *= suffixProduct;
            suffixProduct *= nums[i];
        }
        return result;
    }
}
