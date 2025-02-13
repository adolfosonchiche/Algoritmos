package com.adolfosc.algoritmo;

import java.util.Arrays;

/**
 *
 * @author adolfo-son
 */
public class Algoritmo {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        ArrayObject array = new ArrayObject();
        
        Object [] arr1 = new Object[] {1, 2, new Object[]{"3", "4"}};
        Object [] arr2 = new Object[] {1, 2, new Object[]{3, 4 , new Object[]{5, 6}}};
        Object [] arr3 = new Object[] {1, 2, new Object[]{"a", "b" , new Object[]{5, 6}}};
        Object [] arr4 = new Object[] {1, 2, new Object[]{3, 4 , new Object[]{5, 6, new Object[]{7, 8, new Object[]{9, 10}}}}};
     
        Object[] resultTemp = new Object[arr1.length];      
        Object[] result = array.transformArray(arr1, 0, resultTemp);
        System.out.println("resultado  Array 1: " + Arrays.deepToString(result));
        
        resultTemp = new Object[arr2.length];      
        result = array.transformArray(arr2, 0, resultTemp);
        System.out.println("resultado  Array 2: " + Arrays.deepToString(result));
        
        resultTemp = new Object[arr3.length];      
        result = array.transformArray(arr3, 0, resultTemp);
        System.out.println("resultado  Array 3: " + Arrays.deepToString(result));
        
        resultTemp = new Object[arr4.length];      
        result = array.transformArray(arr4, 0, resultTemp);
        System.out.println("resultado  Array 4: " + Arrays.deepToString(result));      
        
    }
    
}
