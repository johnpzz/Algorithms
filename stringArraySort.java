/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms;

import java.util.Arrays;

/**
 *
 * @author John
 */

//String array of {1.2.15, 2.13.1, 2.4.4} etc.. must sort them
public class stringArraySort {
    
    public static String[] stringSort(String[] array) {
        
        Arrays.sort(array);
        return array;
     
    }
    
    
    
    
    
   
    
    public static void main(String[] args) {
       

        // This is magic
        String[] array = {"1.2.14", "1.1.1", "1.1.4", "1.2.1", "2.3.14", "3.3.3", "2.2.3"};
        
        System.out.println("Before sort: ");
        for (String a : array) {
            System.out.println(a);
        }
        
        String[] s = stringSort(array);
        
        System.out.println("\nPost sort: ");
        for (String a : array) {
            System.out.println(a);
        }
        
    }
    
}
