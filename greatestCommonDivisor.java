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
public class greatestCommonDivisor {
    
    
    
    public static int gcd(int a, int b) {
        int divisor = 1;
        
        // New note added: Here, I think we can go until Math.min(a,b)/2 because factors don't exceed half of the number.  (12 has 1,2,3,4,6)
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a%i == 0 && b%i == 0)
                divisor = i;
        }
        return divisor;
       
        
    }
    
    
    
    public static void main (String[] args) {
        
        System.out.println(gcd(200,172));
        
    }
    
}
