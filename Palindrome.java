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
public class Palindrome {
    
    
    public static boolean isPalindrome(String input) {
        
        // Using a StringBuilder object is more efficient than constantly creating new String with += concatenation in our loop (?)
        StringBuilder backwardsCopy = new StringBuilder();
        
        for (int i = input.length()-1; i >=0; i--) {
            backwardsCopy.append(input.charAt(i));
        }
        
        // Convert our StringBuilder object to a String
        String backwards = backwardsCopy.toString();
        
        // Compare string values with .equals!  == Compares Object references
        if (backwards.equals(input)) {
            return true;
        } else
            return false;
        
        
    }

    public static void main (String[] args) {
        
        System.out.println(isPalindrome("racecar"));
        
    }
    
}
