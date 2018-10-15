/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author John
 */
public class youtubegoogleeexamplecodingquestion {
    

        // Trivial answer, so is going from i -> length and doing binary search for a number that adds to i for the value u want
        //System.out.println(hasAnswer(array, 22));
    public static boolean hasAnswer(int[] array, int value) {
        boolean isFound = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1 ; j < array.length; j++) {
                if (array[i] + array[j] == value) {
                    return true;
                }
            }
        }
        return false;
    }
    
        
        // If array is sorted, this works.
        // If unsorted, by sorting we have an nlogn solution.
        // But what if our array is not guaranteed to be sorted and we don't wanna sort first?
    public static boolean betterAnswer(int[] array, int value) {
        int low = 0;
        int high = array.length-1;
        
        while (low < high) {
            if (array[low] + array[high] == value) {
                return true;
            } else if (array[low] + array[high] > value) {
                high--;
            } else {
                low++;
            }
        }
        return false;
    }
    
    public static boolean bestAnswer(int[] array, int sum) {
        Set<Integer> complements = new HashSet<>();
        //set filled with complements of numbers in array to add to sum
        //[1,2,3,9], sum = 8     compliment of 1 -> 7, 2 -> 6, ..
        
        for (int i : array) {
            if (complements.contains(i))
                return true;
            else
                complements.add(sum-i);
        }

        return false;
    }
    
    
    
    
    public static void main (String[] args) {

        int[] array = {1,2,4,4};
        System.out.println(bestAnswer(array, 8));

    
    }
    
}
