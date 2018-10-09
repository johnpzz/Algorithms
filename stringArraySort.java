/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgorithmPractice;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author John
 */

// ************* WIP *************** not fully functional


//String array of {1.2.15, 2.13.1, 2.4.4, 2.2} etc.. must sort them in increasing order

// If you cannot do it this way, then here's my idea:
// Split the numbers based on their decimal point
// So: 1.2.15 becomes 1 2 15 in a String[]
// Put these all in a parent String[] of size input*3
// Do a bubble-sort type of check comparing last index, then second index, then first and swap as necessary
// WIP.. how to do comparisons

public class stringArraySort {
    
    public static String[] stringSort(String[] array) {
        
        // This is my magnum opus
        Arrays.sort(array/*, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                String s1 = (String) o1;
                String s2 = (String) o2;
                s1 = s1.replaceAll("\\.", "");
                s2 = s2.replaceAll("\\.", "");
                
                Integer a = Integer.parseInt(s1);
                Integer b = Integer.parseInt(s2);
                return a - b;
                //return s1.compareTo(s2);
            }
            
        }*/);
        return array;
     
    }
    
    
    
    
    
   
    
    public static void main(String[] args) {
        /*
        String aa = "1.1.1";
        aa = aa.replaceAll("\\.", "");
        System.out.println("aa: " + aa + "\n");
       */
        

        String[] array = {"1.2.14", "1.1.1", "1.1.4", "1.2.1", "2.3.14", "3.3.3", "2.2.3"};
        String[] array2 = {"1.2.2", "1.2.13", "1.2.1", "1.2.16", "1.3"};
        
       
        
        System.out.println("Before sort: ");
        for (String a : array) {
            System.out.println(a);
        }
        
        String[] s = stringSort(array);
        
        
        System.out.println("\nPost sort: ");
        for (String a : s) 
            System.out.println(a);
        
        System.out.println("\nBefore sort: ");
        for (String a : array2)
            System.out.println(a);
        
        
        String[] s2 = stringSort(array2);
        
        System.out.println("Post sort: ");
        for (String a : s2)
            System.out.println(a);
        
        
    }

    
}