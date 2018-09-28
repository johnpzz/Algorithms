/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms;

import java.util.ArrayList;

/**
 *
 * @author John
 */
public class PrimeNumbers {
    
    // Given an input of size n, return all prime numbers leading up to n.
    // * Prime Number = A number that divides evenly with exactly two positive divisors (itself, and 1)
    public static ArrayList<Integer> primeNumbers(int n) {
        ArrayList<Integer> primeList = new ArrayList<>();
        
        for (int i = 2; i <= n; i++) {
            int flag = 0;
            
            // In this inner loop, j <= i wouldn't work because evaluating i % j or i % i at the end is always going to be == 0.
            // Also, while looping until i-1 would still work, it's unnecessary to check.  We can go from 2 to i/2 and just evaluate half and check.
            // Evaluations greater than i/2 are meaningless mathematically because we are looking for divisible factors and the biggest possible factor is i/2.
            for (int j = 2; j <= i/2; j++) {
                if (i % j == 0) {
                    flag = 1;
                }
            }
            
         if (flag == 0) {
             primeList.add(i);
         }
            
        }
        
        
        
        
        
        
        return primeList;
    }
    
    
    
    
    
    
    
    
    
    
    
    public static void main (String[] args) {
        
        System.out.println(primeNumbers(100));
        
    }
    
}
