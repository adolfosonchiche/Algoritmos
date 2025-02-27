
package com.adolfosc.algoritmo;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author adolfo-son
 */
public class ArrayObjectTest {
    
    public ArrayObjectTest() {
    }

    /**
     * Test of obtainSingleArray method, of class ArrayObject.
     */
    @org.junit.jupiter.api.Test
    public void testObtainSingleArray() {
        System.out.println("obtainSingleArray");
        Object[] arr = null;
        Object[] result_2 = null;
        ArrayObject instance = new ArrayObject();
        Object[] expResult = null;
        Object[] result = instance.obtainSingleArray(arr, result_2);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of transformArray method, of class ArrayObject.
     */
    @org.junit.jupiter.api.Test
    public void testTransformArray() {
        //arrange -- preparar datos
        System.out.println("transformArray");
        Object [] arr1 = new Object[] {1, 2, new Object[]{"3", "4"}};
        //Object[] arr = null;
        int contador = 0;
        Object[] result_2 = new Object[arr1.length];
        ArrayObject instance = new ArrayObject();
        Object[] expResult = {1,2,"3","4"};
        
        //ACT realizar la accion
        Object[] result = instance.transformArray(arr1, contador, result_2);
        
        //Assert  comprobar el resultado
        assertArrayEquals(expResult, result);
    }
    
    // TDD vs BDD
    
}
