package com.adolfosc.algoritmo;

/**
 *
 * @author adolfo-son
 */
public class ArrayObject {
    
    
    public Object[] obtainSingleArray(Object[] arr, Object[] result){
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];            
        }
        return result;
    }
    
    
    public Object[] transformArray(Object[] arr, int contador, Object[] result) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getClass().isArray()){
                int length = ((Object[]) arr[i]).length + result.length -1;
                Object [] newArrayResult = new Object[length];
                newArrayResult = this.obtainSingleArray(result, newArrayResult);
                return transformArray((Object[]) arr[i], contador, newArrayResult);                
            } else {
                result[contador] = arr[i];
                contador++;
            }           
        }
        
        return result;
    }
}
