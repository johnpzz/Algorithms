/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms;

/**
 *
 * @author John
 */
public class binarySearch {
    
    public static int recursiveBinarySearch(int[] array, int key, int l, int r) {
        
        if (l <= r) {
            
        //int mid = ((right-left) + left)/2;  <-- Produces StackOverflow error.. why?
        int mid = l + (r-l)/2;      // Fixes the rare bug of mid = high+low/2 being greater than int capacity

        
        if (array[mid] == key) {
            return mid;
            
            
        } else if (array[mid] > key) {
            return recursiveBinarySearch(array, key, l, mid-1);
            
            
        } else {
            return recursiveBinarySearch(array, key, mid+1, r);
        }
        
        
        
        }
        return -1;
      
    }
    
    public static int iterativeBinarySearch(int arr[], int key) 
    { 
        int left = 0;
        int right = arr.length-1;
        
        while (left <= right) 
        { 
            int mid = left + (right - left)/2; 
  
            // If the element is present at the  
            // middle itself 
            if (arr[mid] == key) 
               return mid; 
  
            // If element is smaller than mid, then  
            // it can only be present in left subarray 
            else if (arr[mid] > key) {
                right = mid-1;
            } else if (arr[mid] < key) {
                left = mid+1;
            }
     
        } 
  
        // We reach here when element is not present 
        //  in array 
        return -1; 
    } 

    
    
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,9,11,13,15};   //size = 10
        
        System.out.println(iterativeBinarySearch(arr,13));
        System.out.println(iterativeBinarySearch(arr,4));


        System.out.println(recursiveBinarySearch(arr,8,0,arr.length-1));
        System.out.println(recursiveBinarySearch(arr,5,0,arr.length));


        
        

    }

    
}
