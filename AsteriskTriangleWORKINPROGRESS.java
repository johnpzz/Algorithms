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
public class AsteriskTriangleWORKINPROGRESS {
    
    public static void triangle(int n) {
        
        
        for (int a = 0; a < n; a++) {
            
            for (int i = 0; i < n-1-a; i++) {
                System.out.print(" ");
            }

            System.out.print("*");

            for (int i = n-1; i > 0; i--) {
                System.out.print(" ");
            }
            
            // Next side
            
            for (int i = 0; i < n/2-1-a; i++) {
                System.out.print(" ");
            }

            


            
            System.out.println();
        }
        
        
        
    }
    
    
    
    
    
    
    
    
    
    public static void main (String[] args) {
        triangle(5);
        
        
        
    }
    
}
