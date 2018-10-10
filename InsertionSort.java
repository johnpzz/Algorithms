/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgorithmPractice;

/**
 *
 * @author johnzubiri
 */
public class InsertionSort {
    
    public static int[] insertionSort(int[] arr) {
        
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int prev = i-1;
            
            while (arr[prev] > key && prev >= 0) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            
            
            arr[prev+1] = key;
        }
        
        return arr;
    }
    
    
    
    
    public static void main (String[] args) {
        
        
        int[] arr = {2,5,7,9,10,3,6,13,20,5};
        
        
        insertionSort(arr);
        
        for (int i : arr) {
            System.out.println(i);
        }
        
        
        
        
        
        
    }
    
}
