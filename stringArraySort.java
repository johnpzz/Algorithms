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

// If you cannot do it this way, then here's my idea:
// Split the numbers based on their decimal point
// So: 1.2.15 becomes 1 2 15 in a String[]
// Put these all in a parent String[] of size input*3
// Do a bubble-sort type of check comparing last index, then second index, then first and swap as necessary
// using two nested for loops where i = 0..array.length-1-3 and j = 2*index..0 where index starts at 0
// and increments each time the loops are ran

public class stringArraySort {
    
    public static String[] stringSort(String[] array) {
        
        // This is magic
        Arrays.sort(array);
        return array;
     
    }
    
    
    
    
    
   
    
    public static void main(String[] args) {
       

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
