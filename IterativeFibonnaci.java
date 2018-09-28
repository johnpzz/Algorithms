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
public class IterativeFibonnaci {
    
    // Recursive Fibonnaci is O(2^n) time complexity (exponential -> very poor)
    // In this case, iterative version is much more efficient (O(n-2) or O(n)).
    // Recursive Fib(100) takes ~13 days, Iterative Fib(100) takes ~101 nsec.
    
    public static int fibonacci(int n) {
        
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int num1 = 0;
            int num2 = 1;

            int fibSum = 0;
            //iterate from index 2 to the length of n
            for (int i = 2; i <= n; i++) {      
                fibSum = num1 + num2;
                num1 = num2;
                num2 = fibSum;
            }
            return fibSum;
        }

        
    }
    
    
    
    
    
    
    
    
    
    
    
    public static void main (String[] args) {
        System.out.println(fibonacci(13));
    }
    
}
